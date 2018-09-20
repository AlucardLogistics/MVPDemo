package com.example.sadic.mvpdemo.data;

import android.content.Context;

import com.example.sadic.mvpdemo.data.database.DbHelper;
import com.example.sadic.mvpdemo.data.database.IDbHelper;

public class DataManager implements IDataManager {

    IDbHelper idbHelper;

    public DataManager(Context context) {
        this.idbHelper = new DbHelper(context);
    }



    @Override
    public void createRow(String[] data) {
        idbHelper.createRow(data);
    }

    @Override
    public void readRow(OnResponseListener listener) {
        idbHelper.readRow(listener);
    }

    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {
        idbHelper.deleteRow();
    }
}
