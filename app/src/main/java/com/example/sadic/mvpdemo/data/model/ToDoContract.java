package com.example.sadic.mvpdemo.data.model;

import android.provider.BaseColumns;

public class ToDoContract {
    public ToDoContract() {
    }

    public static abstract class ToDoEntry implements BaseColumns {
        public static final String TABLE_NAME = "bestTable";
        public static final String TITLE = "bestTitle";
        public static final String SUBTITLE = "bestSubTitle";
    }

}
