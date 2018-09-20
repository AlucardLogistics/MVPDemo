package com.example.sadic.mvpdemo.data.model;

import android.provider.BaseColumns;

public final class LogInContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public LogInContract() {}

    /* Inner class that defines the table contents */
    public static abstract class LoginEntry implements BaseColumns {
        public static final String TABLE_NAME = "Login";
        public static final String USER_ID = "UserID";
        public static final String USER_PASSWORD = "Password";

    }
}