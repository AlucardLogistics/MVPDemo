package com.example.sadic.mvpdemo.data.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.sadic.mvpdemo.data.IDataManager;
import com.example.sadic.mvpdemo.data.model.ToDoContract;

public class DbHelper implements IDbHelper {

    DBOpenHelper dbOpenHelper;
    SQLiteDatabase db;

    public DbHelper(Context context) {
        dbOpenHelper = new DBOpenHelper(context);
        db = dbOpenHelper.getWritableDatabase();
    }



    @Override
    public void createRow(String[] data) {
        ContentValues values = new ContentValues();
        values.put(ToDoContract.ToDoEntry.TITLE,data[0]);
        values.put(ToDoContract.ToDoEntry.SUBTITLE,data[1]);
        db.insert(ToDoContract.ToDoEntry.TABLE_NAME,null,values);
    }

    @Override
    public void readRow(IDataManager.OnResponseListener listener) {
        listener.getTodoNote("It's NinnYu!!! :D");
    }

    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {

    }
}
