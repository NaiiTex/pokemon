package com.uca.core;

import com.uca.dao.UserDAO;
import com.uca.entity.UserEntity;

import java.util.ArrayList;

public class UserCore {
    private  UserEntity obj;
    public static ArrayList<UserEntity> getAllUsers() {
        return new UserDAO().getAllUsers();
    }
    public static UserEntity Create(UserEntity obj) {
        return new UserDAO().create(obj );
    }

    public static String Login() { return new UserDAO().CheckLogin(); }
}
