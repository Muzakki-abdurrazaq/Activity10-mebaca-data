package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edemail,edpassword;
    String nama, password;
    TextView daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);
        edemail=findViewById(R.id.edemail);
        edpassword=findViewById(R.id.edpassword);
        daftar = findViewById(R.id.register);



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "admin@mail.com";
                String pass = "123";

                if(nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan password wajib diisi",
                            Toast.LENGTH_LONG);
                    t.show();
                }else {
                    if (nama.equals(email)&&password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login sukses",
                                Toast.LENGTH_LONG);
                        t.show();
                    }else {
                        Toast t =Toast.makeText(getApplicationContext(),
                                "Login gagal",
                                Toast.LENGTH_LONG);
                    }
                }
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Register.class);
                startActivity(i);
            }
        });
    }
}