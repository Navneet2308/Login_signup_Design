package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SignUp_Activity extends AppCompatActivity {
TextInputLayout passwrd_lyout,cpasswrd_lyout;
TextInputEditText fname,lname,email,phone,pass,cpass;
RelativeLayout btn_lyout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);

        passwrd_lyout=findViewById(R.id.inputPass);
        cpasswrd_lyout=findViewById(R.id.inputcPass);
        btn_lyout=findViewById(R.id.btn_lyout);
        fname=findViewById(R.id.edtfirstname);
        lname=findViewById(R.id.edttlastname);
        email=findViewById(R.id.edtEmail);
        phone=findViewById(R.id.edtNumber);
        pass=findViewById(R.id.edtPassword);
        cpass=findViewById(R.id.edtcPassword);

//spinner1
        String[] arraySpinner = new String[] {
                "Engineering", "Doctor", "IT", "Teacher", "Accountant", "HR"
        };
        Spinner s = (Spinner) findViewById(R.id.listview_occuptiomm);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);



        btn_lyout.setEnabled(false);

        //spinner2

        String[] arraySpinner1 = new String[] {
                "English", "Hindi", "Urdu"
        };
        Spinner s1 = (Spinner) findViewById(R.id.listview_lungauge);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter1);





        fname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

             boolean is_all_field_fill =   validate(new TextInputEditText[] {fname,lname,email,phone,pass,cpass });
             if (is_all_field_fill)
             {
                 btn_lyout.setEnabled(true);
                 btn_lyout.setAlpha(1);
             }
             else
             {
                 btn_lyout.setEnabled(false);
                 btn_lyout.setAlpha((float) 0.3);
             }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        lname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                boolean is_all_field_fill =   validate(new TextInputEditText[] {fname,lname,email,phone,pass,cpass });
                if (is_all_field_fill)
                {
                    btn_lyout.setEnabled(true);
                    btn_lyout.setAlpha(1);
                }
                else
                {
                    btn_lyout.setEnabled(false);
                    btn_lyout.setAlpha((float) 0.3);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                boolean is_all_field_fill =   validate(new TextInputEditText[] {fname,lname,email,phone,pass,cpass });
                if (is_all_field_fill)
                {
                    btn_lyout.setEnabled(true);
                    btn_lyout.setAlpha(1);
                }
                else
                {
                    btn_lyout.setEnabled(false);
                    btn_lyout.setAlpha((float) 0.3);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                boolean is_all_field_fill =   validate(new TextInputEditText[] {fname,lname,email,phone,pass,cpass });
                if (is_all_field_fill)
                {
                    btn_lyout.setEnabled(true);
                    btn_lyout.setAlpha(1);
                }
                else
                {
                    btn_lyout.setEnabled(false);
                    btn_lyout.setAlpha((float) 0.3);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        pass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                boolean is_all_field_fill =   validate(new TextInputEditText[] {fname,lname,email,phone,pass,cpass });
                if (is_all_field_fill)
                {
                    btn_lyout.setEnabled(true);
                    btn_lyout.setAlpha(1);
                }
                else
                {
                    btn_lyout.setEnabled(false);
                    btn_lyout.setAlpha((float) 0.3);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        cpass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                boolean is_all_field_fill =   validate(new TextInputEditText[] {fname,lname,email,phone,pass,cpass });
                if (is_all_field_fill)
                {
                    btn_lyout.setEnabled(true);
                    btn_lyout.setAlpha(1);
                }
                else
                {
                    btn_lyout.setEnabled(false);
                    btn_lyout.setAlpha((float) 0.3);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });







        btn_lyout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!pass.getText().toString().equals(cpass.getText().toString()))
                {
                    cpasswrd_lyout.setError("Password mismatch");
                }
                else
                {
                    cpasswrd_lyout.setErrorEnabled(false);
                    Intent intent = new Intent(SignUp_Activity.this,Login_Activity.class);
                    startActivity(intent);
                    finish();

                }


            }
        });



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