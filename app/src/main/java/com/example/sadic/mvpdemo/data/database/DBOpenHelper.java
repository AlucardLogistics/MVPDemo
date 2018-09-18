package com.example.sadic.mvpdemo.data.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.sadic.mvpdemo.data.model.ToDoContract.ToDoEntry;

public class DBOpenHelper extends SQLiteOpenHelper {

    String create_table = "CREATE TABLE " + ToDoEntry.TABLE_NAME
            + "(" + ToDoEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ToDoEntry.TITLE + " TEXT, " + ToDoEntry.SUBTITLE + " TEXT);";

    public DBOpenHelper(Context context) {
        super(context, "demoDatabase", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
