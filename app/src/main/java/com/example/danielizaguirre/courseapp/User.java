package com.example.danielizaguirre.courseapp;

/**
 * Created by Daniel Izaguirre on 8/28/2017.
 */

public class User {

    private String username;
    private String password;

//    public User(String username, String password){
//        this.username = username;
//        this.password = password;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String responseMessage(){
        String message = username + " " + password;
        return message;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
