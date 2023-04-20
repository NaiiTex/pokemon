package com.uca;

import com.uca.dao._Initializer;
import com.uca.gui.*;

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
       /* get("/login",(req, res) -> {
            Username = req.username;
            Password = req.password;
            return Controllers.CheckLogin(Username;Password);
        });

        checklogin(String Username, String Password){
*/


        }



}