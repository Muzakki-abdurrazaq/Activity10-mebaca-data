package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password,massage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.button);
        edemail=findViewById(R.id.editText);
        edpassword=findViewById(R.id.editText2);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();
                if (nama.equals("admin@mail.com")&& password.equals("123"){
                    Toast t=Toast.makeText(getApplicationContext(),
                            "Login sukses");
                    t.show();
                }
                else{
                    Toast t=Toast.makeText(getApplicationContext(),
                            "Login gagal");
                    t.show();
                }



            }
        }
    }
}