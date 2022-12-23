package com.example.uasberita;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class detailBerita extends AppCompatActivity {
    TextView txtJudul, txtKategori, txtIsi;
    String judul, kategori, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_berita);

        txtJudul = findViewById(R.id.txt_judul);
        txtKategori = findViewById(R.id.txt_kategori);
        txtIsi = findViewById(R.id.txt_isi);

        Bundle bundle = getIntent().getExtras();
        judul = bundle.getString("judul");
        kategori = bundle.getString("kategori");
        isi = bundle.getString("isi");

        txtJudul.setText(judul);
        txtKategori.setText(kategori);
        txtIsi.setText(isi);
    }
}

