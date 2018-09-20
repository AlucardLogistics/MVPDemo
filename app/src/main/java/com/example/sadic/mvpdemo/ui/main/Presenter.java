package com.example.sadic.mvpdemo.ui.main;

import android.content.Context;
import android.view.View;

import com.example.sadic.mvpdemo.R;
import com.example.sadic.mvpdemo.data.DataManager;
import com.example.sadic.mvpdemo.data.IDataManager;

public class Presenter implements IPresenter, IDataManager.OnResponseListener {

    IView iView;
    IDataManager iDataManager;
    Context context;

    public Presenter(MainActivity mainActivity) {
        iView = mainActivity;
        iDataManager = new DataManager(mainActivity);
        context = mainActivity;
    }

    @Override
    public void onButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.btLogin:
                //this should start your second activity from presenter
                //context.startActivity(iView, SecondActivity.class);
                iView.showToast("MY TOAST");
                String[] data = iView.bundleData();
                //iDataManager.readRow(this);
                iDataManager.createRow(data);
                break;
            case R.id.btnGet:
                iDataManager.readRow(this);
                break;
            case R.id.btn_delete:
                iDataManager.deleteRow();
                break;
        }
    }

    @Override
    public void getTodoNote(String s) {
        iView.showToast(s);
    }
}
