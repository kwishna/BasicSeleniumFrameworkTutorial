package com.examples.ennums;

public enum ErrorMessage {

    UsernameError("Username is not filled"),
    PasswordError("Password is not filled"),
    GenderError("Gender is not selected");

    private final String msg;

    ErrorMessage(String message) {
        this.msg = message;
    }

    public String getMessage() {
        return this.msg;
    }
}
