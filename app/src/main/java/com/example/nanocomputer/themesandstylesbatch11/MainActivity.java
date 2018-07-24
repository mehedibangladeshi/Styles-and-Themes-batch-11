package com.example.nanocomputer.themesandstylesbatch11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText etName, etEmail, etId, etPass, etPhone;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etName = findViewById(R.id.et_name);
        etEmail = findViewById(R.id.et_email);
        etId = findViewById(R.id.et_id);
        etPass = findViewById(R.id.et_pass);
        etPhone = findViewById(R.id.et_phone);

        btnSubmit = findViewById(R.id.btn_submit);



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,
                        "Name: "+etName.getText().toString()
                        +" Email: "+etEmail.getText().toString()
                                +" ID: "+etId.getText().toString()
                        +" Phone: "+etPhone.getText().toString()
                        +"", Toast.LENGTH_SHORT).show();


            }
        });


























    }
}
