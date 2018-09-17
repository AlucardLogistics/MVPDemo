package com.example.sadic.mvpdemo;

import android.view.View;

public class Presenter implements IPresenter {

    IView iView;

    public Presenter(MainActivity mainActivity) {
        iView = mainActivity;
    }

    @Override
    public void onButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.btLogin:
                iView.showToast("MY TOAST");
                break;
        }
    }
}
