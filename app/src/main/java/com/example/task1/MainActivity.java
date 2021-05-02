package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login_page(View v)
    {

        Intent intent = new Intent(MainActivity.this,Login_Activity.class);
        startActivity(intent);

    }

    public void signup_page(View v)
    {

        Intent intent = new Intent(MainActivity.this,SignUp_Activity.class);
        startActivity(intent);

    }
}