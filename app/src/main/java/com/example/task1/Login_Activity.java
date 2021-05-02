package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Login_Activity extends AppCompatActivity {
RelativeLayout sign_in_lyout;
    TextInputEditText edtEmail,edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        sign_in_lyout=findViewById(R.id.sign_in_lyout);
        edtPassword=findViewById(R.id.edtPassword);
        edtEmail=findViewById(R.id.edtEmail);

        edtEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                boolean is_all_field_fill =   validate(new TextInputEditText[] {edtEmail,edtPassword });
                if (is_all_field_fill)
                {
                    sign_in_lyout.setEnabled(true);
                    sign_in_lyout.setAlpha(1);
                }
                else
                {
                    sign_in_lyout.setEnabled(false);
                    sign_in_lyout.setAlpha((float) 0.3);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        edtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                boolean is_all_field_fill =   validate(new TextInputEditText[] {edtEmail,edtPassword });
                if (is_all_field_fill)
                {
                    sign_in_lyout.setEnabled(true);
                    sign_in_lyout.setAlpha(1);
                }
                else
                {
                    sign_in_lyout.setEnabled(false);
                    sign_in_lyout.setAlpha((float) 0.3);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        sign_in_lyout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login_Activity.this, "User Not Register", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void signup_page(View v)
    {

        Intent intent = new Intent(Login_Activity.this,SignUp_Activity.class);
        startActivity(intent);

    }


    private boolean validate(TextInputEditText[] fields){
        for(int i = 0; i < fields.length; i++){
            EditText currentField = fields[i];
            if(currentField.getText().toString().length() <= 0){
                return false;
            }
        }
        return true;
    }


}