package com.uca.core;

import com.uca.dao.UserDAO;
import com.uca.entity.UserEntity;

import java.util.ArrayList;

public class UserCore {

    public static ArrayList<UserEntity> getAllUsers() {
        return new UserDAO().getAllUsers();
    }

    public static UserEntity getUserByUsernameAndPassword(String username, String password) {
        ArrayList<UserEntity> users = new UserDAO().getAllUsers();
        for (UserEntity user : users) {
            if (user.getEmail().equals(username) && user.getPwd().equals(password)) {
                return user;
            }
        }
        return null;
    }


}
