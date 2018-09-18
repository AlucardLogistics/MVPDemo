package com.example.sadic.mvpdemo.data.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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

        Cursor cursor = db.query(ToDoContract.ToDoEntry.TABLE_NAME,
                null,null,null,null,null,null);

        cursor.moveToLast();
        int titleIndex = cursor.getColumnIndex(ToDoContract.ToDoEntry.TITLE);
        int subtitleIndex = cursor.getColumnIndex(ToDoContract.ToDoEntry.SUBTITLE);

        String result = cursor.getString(titleIndex) + "\n" + cursor.getString(subtitleIndex);

        listener.getTodoNote(result);
    }

    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {

    }
}
