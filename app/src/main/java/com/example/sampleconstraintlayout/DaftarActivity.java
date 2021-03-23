package com.example.sampleconstraintlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarActivity extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
