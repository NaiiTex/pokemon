package com.uca;

import com.uca.dao._Connector;
import com.uca.dao._Initializer;
import com.uca.gui.*;
import spark.ModelAndView;
import spark.Spark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class StartServer {

    public static void main(String[] args) {
        //Configure Spark
        staticFiles.location("/static/");
        port(8081);


        _Initializer.Init();
        String jdbcUrl = "jdbc:h2:~/test";
        Connection connection = _Connector.getInstance();
        //Defining our routes
        get("/users", (req, res) -> {
            return UserGUI.getAllUsers();
        });
        get("/register", (req, res) -> {
            return UserGUI.Create();
        });
        get("/login", (req, res) -> {
            return UserGUI.Login();
        });








// Login handler
        //        post("/login", (request, response) -> {
        //  String email = request.queryParams("email");
        //  String password = request.queryParams("password");
//
        //          // Check if the email and password match a record in the database
        //  ResultSet result = connection.createStatement().executeQuery("SELECT * FROM users WHERE email = '" + email + "' AND mdp = '" + password + "'");
        //  if (result.next()) {
        //      // Set a session attribute to store the user's ID
        //      request.session().attribute("userId", result.getInt("id"));
        //      response.redirect("/home");
        //  } else {
        //      return "Invalid email or password";
        //  }

        //  return null;
        // });


// Registration page
        //       get("/register", (request, response) -> {
        //         return "<html><body>" +
        //           "<h2>Registration</h2>" + "<form action='/register' method='post'>" +
        //           "Nom: <input type='text' name='nom'><br>" +
        //            "Prenom: <input type='text' name='prenom'><br>" +
        //           "Email: <input type='text' name='email'><br>" +
        //             "Password: <input type='password' name='password'><br>" +
        //             "<input type='submit' value='Register'>" +
        //            "</form>" +
        //            "</body></html>";
        //  });

    } }