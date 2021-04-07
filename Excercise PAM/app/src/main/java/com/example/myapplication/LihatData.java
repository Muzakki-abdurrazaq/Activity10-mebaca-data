package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

public class LihatData {
    TextView tvnama,tvnomor;

    Bundle bundle = getIntent().getExtras();

    String nama = bundle.getString("a");
}
