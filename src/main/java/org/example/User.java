package org.example;

public class User {
    String userId;
    String  password;

    public User(String userId, String  password) {
        this.userId = userId;
        this.password = password;
    }

    public String getuserId() {
        return this.userId;
    }
}
