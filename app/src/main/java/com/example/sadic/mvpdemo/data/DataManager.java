package com.example.sadic.mvpdemo.data;

import com.example.sadic.mvpdemo.data.database.DbHelper;
import com.example.sadic.mvpdemo.data.database.IDbHelper;

public class DataManager implements IDataManager {

    IDbHelper idbHelper;

    public DataManager() {
        this.idbHelper = new DbHelper();
    }

    @Override
    public void createRow() {

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

    }
}
