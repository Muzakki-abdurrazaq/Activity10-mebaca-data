package com.example.fbkelasa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fbkelasa.adapter.AdapterLihatTeman;
import com.example.fbkelasa.database.Teman;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class LihatTeman extends AppCompatActivity {
    private DatabaseReference databaseReference;
    private RecyclerView rcView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Teman> dataTeman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_teman);

        //inisialisasi untuk RecyclerView beserta komponennya
        rcView = (RecyclerView) findViewById(R.id.rv_utama);
        rcView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rcView.setLayoutManager(layoutManager);

        //inisialisasi dan membaca Firebase database reference
        databaseReference = FirebaseDatabase.getInstance().getReference();

        //mengambil data dari realtime database dalam firebase
        databaseReference.child("Teman").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                dataTeman = new ArrayList<>();
                for(DataSnapshot daftarDS:snapshot.getChildren()){
                    Teman tmn = daftarDS.getValue(Teman.class);
                    tmn.setKode(daftarDS.getKey());

                    dataTeman.add(tmn);
                }
                adapter = new AdapterLihatTeman(dataTeman,LihatTeman.this);
                rcView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                System.out.println(error.getDetails()+""+error.getMessage());

            }
        });
    }
}