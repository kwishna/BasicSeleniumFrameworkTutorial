package com.examples.ennums;

public enum ErrorEnum {
    UserMissingError("Username is not filled"),
    // This is an object of ErrorEnum. It is not instance variable.
    // The value passed in bracket will get saved in this.msg through constructor
    PasswordMissingError("Password is not filled");

    private final String msg;

    ErrorEnum(String message) {
        this.msg = message;
    } // constructor

    public String getMessage() {
        return this.msg;
    }
}
