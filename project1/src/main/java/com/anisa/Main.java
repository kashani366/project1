package com.anisa;

import com.anisa.model.entity.Gender;
import com.anisa.model.entity.User;
import com.anisa.model.service.UserService;

import java.util.List;

public class Main {
    private UserService userService;

    public static void main(String[] args) throws Exception {


        UserService userService = new UserService();
        User user = new User();
        for (int i = 0; i < 100; i++) {
            user.setName(user.getName());
            user.setFullname(user.getFullname());
            user.setAge(user.getAge());
            user.setNationalcode("00" + user.getNationalcode());
            user.setPhonnumber("09" + user.getPhonnumber());
            user.setGender(Gender.valueOf("" + user.getGender()));
            userService.inserUser(user);
        }

        List<User> users = userService.showUser();

        System.out.println("--------------------------------------");
        System.out.println("" + users.get(0));
    }

}
