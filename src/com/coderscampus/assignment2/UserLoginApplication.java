package com.coderscampus.assignment2;

public class UserLoginApplication {

    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.retrieveUser();
        userService.validateLogin();
    }
}