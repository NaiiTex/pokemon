package com.uca;

import com.uca.dao._Initializer;
import com.uca.entity.*;
import com.uca.gui.*;
import com.uca.core.*;

import static spark.Spark.*;

public class StartServer {

    public static void main(String[] args) {
        //Configure Spark
        staticFiles.location("/static/");
        port(8081);


        _Initializer.Init();

        //Defining our routes
        get("/users", (req, res) -> {
            return UserGUI.getAllUsers();
        });

        get("/login", (req, res) -> {
            String username = req.queryParams("username");
            String password = req.queryParams("password");
            UserEntity user = UserCore.getUserByUsernameAndPassword(username, password);
            if (user != null) {
                // valid username and password
                res.redirect("/users");
            } else {
                // invalid username and/or password
                res.redirect("/login?error=1");
            }

            return LoginGUI.getLoginPage();
        });






        }



}