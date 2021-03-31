package com.example.sampleconstraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private ListView list;

    private ListViewAdapter adapter;

    String[] listNama;

    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    Bundle bundle = new Bundle();

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listNama = new String[]{"Inayah", "Ilham", "Eris", "Fikri", "Maul", "Intan", "Vina", "Gita", "Vian", "Lutfi"};

        list = findViewById(R.id.listKontak);

        classNamaArrayList = new ArrayList<>();

        for (int i = 0; i < listNama.length; i++)
        {
            ClassNama classNama = new ClassNama(listNama[i]);

            classNamaArrayList.add(adapter);
        }

        adapter = new ListViewAdapter(this);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nama = classNamaArrayList.get(position).getName();

                bundle.putString("a",nama.trim());

                PopupMenu pm = new PopupMenu(getApplicationContext(),view);
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }
}
