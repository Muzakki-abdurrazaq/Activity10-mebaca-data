package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class Register extends AppCompatActivity {
    EditText edtnama,edtalamat,edtemail,edtpassword,edtrepass;
    Button daftar,batal;
    TextView agama,jnskelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        edtnama = findViewById(R.id.enama);
        edtalamat = findViewById(R.id.edAlamat);
        edtemail = findViewById(R.id.email);
        edtpassword =findViewById(R.id.password);
        edtrepass = findViewById(R.id.repass);
         daftar = findViewById(R.id.btndaftar);
         batal = findViewById(R.id.btnbatal);
         agama = findViewById(R.id.textagama);
         jnskelamin = findViewById(R.id.textjnkelamin);


        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtnama.getText().toString().isEmpty() ||
                edtemail.getText().toString().isEmpty() ||
                edtalamat.getText().toString().isEmpty() ||
                edtpassword.getText().toString().isEmpty() ||
                edtrepass.getText().toString().isEmpty())
                {
                    edtnama.setError("Maasukkan Nama");
                    edtalamat.setError("Masukkan Alamat");
                    edtemail.setError("Masukkan Email");
                    edtpassword.setError("Masukkan Password");
                    edtrepass.setError("Masukkan Repassword");
                }else
                {
                    if (edtpassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Registrastion Succesfull",
                                Toast.LENGTH_SHORT).show();
                    }else
                    {
                        Snackbar.make(view, "Password dan repassword harus sama!!!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent R = new Intent(Register.this,MainActivity.class);
                startActivity(R);
            }
        });
    }
}
