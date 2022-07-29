package com.anisa.model.service;

import com.anisa.model.da.UserDa;
import com.anisa.model.entity.User;

import java.util.List;

public class UserService {

    private UserDa userDa;

    public UserService() {

        userDa=new UserDa();
    }

    public void inserUser(User user)
    {
        userDa.insertUser(user);
    }

    public List<User> showUser(){
        return  userDa.getUser();
    }


}
