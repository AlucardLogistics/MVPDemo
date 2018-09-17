package com.example.sadic.mvpdemo.data.database;

import com.example.sadic.mvpdemo.data.IDataManager;

public interface IDbHelper {

    public void createRow();
    public void readRow(IDataManager.OnResponseListener listener);
    public void updateRow();
    public void deleteRow();
}
