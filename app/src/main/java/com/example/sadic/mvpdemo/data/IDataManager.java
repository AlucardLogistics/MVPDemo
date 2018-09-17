package com.example.sadic.mvpdemo.data;

import com.example.sadic.mvpdemo.data.database.IDbHelper;

public interface IDataManager extends IDbHelper {

    interface OnResponseListener {
        public void getTodoNote(String s);
    }
}
