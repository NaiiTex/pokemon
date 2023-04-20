package com.uca.dao;

import com.uca.entity.UserEntity;

import java.sql.*;
import java.util.ArrayList;

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
        //TODO !
        return null;
    }

    @Override
    public void delete(UserEntity obj) {
        //TODO !
    }
}
