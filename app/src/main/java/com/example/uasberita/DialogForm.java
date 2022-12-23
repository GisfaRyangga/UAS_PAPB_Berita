package com.example.uasberita;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DialogForm extends DialogFragment {
    String judul, kategori, isi, key, pilih;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    public DialogForm(String judul, String kategori, String isi, String key, String pilih) {
        this.judul = judul;
        this.kategori = kategori;
        this.isi = isi;
        this.key = key;
        this.pilih = pilih;
    }

    TextView tv_judul, tv_kategori, tv_isi;
    Button btn_update;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_input_berita, container, false);
        tv_judul = view.findViewById(R.id.et_judul);
        tv_kategori = view.findViewById(R.id.spinner_input);
        tv_isi = view.findViewById(R.id.et_isi_berita);
        btn_update = view.findViewById(R.id.btn_tambah_berita);

        tv_judul.setText(judul);
        tv_kategori.setText(kategori);
        tv_isi.setText(isi);

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String judul = tv_judul.getText().toString();
                String kategori = tv_kategori.getText().toString();
                String isi = tv_isi.getText().toString();

                if (pilih.equals("Ubah")){
                    databaseReference.child("Berita").setValue(new Berita(judul, kategori, isi)).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(view.getContext(), "Berhasil diupdate", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(view.getContext(), "Maaf gagal diupdate", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null){
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
    }
}
