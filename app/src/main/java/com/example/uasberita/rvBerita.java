package com.example.uasberita;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class rvBerita extends AppCompatActivity {
    Spinner spinner;
    RecyclerView recyclerViewBerita;
    List<Berita> beritas = new ArrayList<>();
    beritaAdapter berita_adapter;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_berita);
        spinner = findViewById(R.id.spinner_kategori);
        ExtendedFloatingActionButton btn_add, btn_logout;
        btn_add = findViewById(R.id.add_berita_btn);
        btn_logout = findViewById(R.id.fab_logout);
        recyclerViewBerita = findViewById(R.id.rv_berita);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), InputBerita.class);
                startActivity(intent);
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.logoutPage();
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewBerita.setLayoutManager(layoutManager);
        recyclerViewBerita.setItemAnimator(new DefaultItemAnimator());

        tampilData();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.kategori_berita, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null){
            spinner.setAdapter(adapter);
        }
    }

    private void tampilData() {
        databaseReference.child("Berita").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                beritas = new ArrayList<>();
                for (DataSnapshot item : snapshot.getChildren()){
                    Berita berita = item.getValue(Berita.class);
                    berita.setKey(item.getKey());
                    beritas.add(berita);
                }
                berita_adapter = new beritaAdapter(beritas, rvBerita.this);
                recyclerViewBerita.setAdapter(berita_adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}