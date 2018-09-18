package com.example.sadic.mvpdemo.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sadic.mvpdemo.R;

public class MainActivity extends AppCompatActivity implements IView {

    EditText username, pw;
    IPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
        username = findViewById(R.id.etUser);
        pw = findViewById(R.id.etPass);

    }

    @Override
    public void showToast(String message) {
        TextView show = findViewById(R.id.tvShow);
        show.setText(message);

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public String[] bundleData() {
        String un = username.getText().toString();
        String passw = pw.getText().toString();
        String[] str = {un, passw};

        return str;
    }

    public void handleMethod(View view) {
        presenter.onButtonClicked(view);

    }



}
