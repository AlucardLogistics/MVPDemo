package com.example.sadic.mvpdemo.data.database;

import com.example.sadic.mvpdemo.data.IDataManager;

public class DbHelper implements IDbHelper {

    @Override
    public void createRow() {

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
