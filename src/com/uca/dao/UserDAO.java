package com.uca.dao;

import com.uca.entity.UserEntity;

import java.sql.*;
import java.util.ArrayList;

import static spark.Spark.post;

public class UserDAO extends _Generic<UserEntity> {

    public ArrayList<UserEntity> getAllUsers() {
        ArrayList<UserEntity> entities = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM users ORDER BY id ASC;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                UserEntity entity = new UserEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setNom(resultSet.getString("nom"));
                entity.setPrenom(resultSet.getString("prenom"));
                entity.setEmail(resultSet.getString("email"));
                entity.setMotDePasse(resultSet.getString("mdp"));

                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }

    @Override
    public UserEntity create(UserEntity obj) {
        post("/register", (request, response) -> {

            String nom = request.queryParams("nom");
            String prenom = request.queryParams("prenom");
            String email = request.queryParams("email");
            String password = request.queryParams("password");


            // Check if the email is already taken
            ResultSet result = this.connect.createStatement().executeQuery("SELECT * FROM users WHERE email = '" + email + "'");
            if (result.next()) {
                return "Email already taken";
            }

            // Insert the new user into the database
            PreparedStatement statement = this.connect.prepareStatement("INSERT INTO users(nom, prenom, email, mdp) VALUES(?, ?, ?, ?);");
            statement.setString(1, nom);
            statement.setString(2, prenom);
            statement.setString(3, email);
            statement.setString(4, password);
            statement.executeUpdate();





            response.redirect("/login");
            return null;
        });


        return  obj;
    }

    @Override
    public void delete(UserEntity obj) {
        //TODO !
    }
}
