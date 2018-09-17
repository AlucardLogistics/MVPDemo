package com.example.sadic.mvpdemo.ui.main;

import android.view.View;

import com.example.sadic.mvpdemo.R;
import com.example.sadic.mvpdemo.data.DataManager;
import com.example.sadic.mvpdemo.data.IDataManager;

public class Presenter implements IPresenter, IDataManager.OnResponseListener {

    IView iView;
    IDataManager iDataManager;

    public Presenter(MainActivity mainActivity) {
        iView = mainActivity;
        iDataManager = new DataManager();
    }

    @Override
    public void onButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.btLogin:
                iView.showToast("MY TOAST");
                iDataManager.readRow(this);
                break;
        }
    }

    @Override
    public void getTodoNote(String s) {
        iView.showToast(s);
    }
}
