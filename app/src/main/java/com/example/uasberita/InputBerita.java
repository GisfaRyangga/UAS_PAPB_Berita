package com.example.uasberita;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class InputBerita extends AppCompatActivity {
    EditText inputJudul, inputIsi;
    Spinner spinnerKategori;
    Button btn_tambahBerita, btn_kembaliListBerita;
    public static SharedPreferences sharedPreference;

    private NotificationManager mnotificationManager;
    private final static String CHANNEL_ID = "primary-channel";
    private int NOTIFICATION_ID = 0;

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Berita");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_berita);

        inputJudul = findViewById(R.id.et_judul);
        inputIsi = findViewById(R.id.et_isi_berita);
        spinnerKategori = findViewById(R.id.spinner_input);
        btn_tambahBerita = findViewById(R.id.btn_tambah_berita);
        btn_kembaliListBerita = findViewById(R.id.btn_kembali_list_berita);

        mnotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,
                    "app notif", NotificationManager.IMPORTANCE_HIGH);
            mnotificationManager.createNotificationChannel(notificationChannel);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.kategori_berita, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spinnerKategori != null) {
            spinnerKategori.setAdapter(adapter);
        }

        btn_tambahBerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addBerita();
            }
        });

        btn_kembaliListBerita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputBerita.this, rvBerita.class);
                startActivity(intent);
            }
        });
    }

    public void addBerita(){
        Berita berita = new Berita();
        String judulberita = inputJudul.getText().toString();
        String isiberita = inputIsi.getText().toString();
        String kategori = spinnerKategori.getSelectedItem().toString();

        if (judulberita.isEmpty() || isiberita.isEmpty()){
            Toast.makeText(this, "Data berita tidak boleh ada yang kosong!", Toast.LENGTH_SHORT).show();
        } else {
            databaseReference.addValueEventListener(new ValueEventListener() {

                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    berita.setJudul(judulberita);
                    berita.setIsi(isiberita);
                    berita.setKategori(kategori);

                    databaseReference.child(judulberita).setValue(berita);
                    sendNotification();
//                    Toast.makeText(InputBerita.this, "Berita berhasil ditambahkan!", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }
    }
    private NotificationCompat.Builder getNotificationBuilder() {
        Intent notificationIntent = new Intent(this, rvBerita.class);
        PendingIntent notificationPendingIntent = PendingIntent
                .getActivity(this, NOTIFICATION_ID, notificationIntent,
                        PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder notifyBuilder =
                new NotificationCompat.Builder(this, CHANNEL_ID)
                        .setContentTitle("Berhasil Input")
                        .setContentText("Input berita sukses dilakukan!")
                        .setSmallIcon(R.drawable.ic_baseline_laptop_24).setContentIntent(notificationPendingIntent);
        return notifyBuilder;
    }

    private void sendNotification() {
        NotificationCompat.Builder notifyBuilder = getNotificationBuilder();
        mnotificationManager.notify(NOTIFICATION_ID, notifyBuilder.build());
    }
}

//        Intent intent = getIntent();
//        String mode = intent.getStringExtra("MODE");
//        sharedPreference = getSharedPreferences(MainActivity.sharedPrefPackage, MODE_PRIVATE);
//        userID = sharedPreference.getString(MainActivity.USERNAME_KEY, "user");
//
//        if (mode.equals("MODE_ADD")){
//
//        }
//
//        btn_tambahBerita.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        btn_kembaliListBerita.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(InputBerita.this, rvBerita.class);
//                startActivity(intent);
//            }
//        });
//    }
//    private void load_kategori_spinner(){
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.kategori_berita, android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//
//        if (spinner != null){
//            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                @Override
//                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
////                    kategori = i;
//                }
//
//                @Override
//                public void onNothingSelected(AdapterView<?> parent) {
//
//                }
//            });
//        }
//    }
//    public void getAllInput(){
//        title = inputJudul.getText().toString();
//        isi = inputIsi.getText().toString();
//        batasUsia = Integer.parseInt(inputUsia.getText().toString());
//    }

//    public void tambahBerita(){
//        getAllInput();
//        Berita berita = new Berita(title, kategori, userID, isi, batasUsia);
//    }
