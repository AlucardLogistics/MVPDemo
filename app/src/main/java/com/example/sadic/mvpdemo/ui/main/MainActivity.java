package com.example.sadic.mvpdemo.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sadic.mvpdemo.R;

public class MainActivity extends AppCompatActivity implements IView {

    IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);

    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void handleMethod(View view) {
        switch (view.getId()) {
            case R.id.btLogin:
                presenter.onButtonClicked(view);
        }
    }
}
