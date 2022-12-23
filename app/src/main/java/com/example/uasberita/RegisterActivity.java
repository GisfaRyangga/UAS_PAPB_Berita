package com.example.uasberita;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.DialogFragment;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegisterActivity extends AppCompatActivity {
    EditText tanggal, pass_regis, user_regis;
    Button btn_regis, logout;
    TextView login_now;

    DatabaseReference mDatabaseReference;

    private NotificationManager mnotificationManager;
    private final static String CHANNEL_ID = "primary-channel";
    private int NOTIFICATION_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mDatabaseReference = FirebaseDatabase.getInstance().getReference().child("User");

        mnotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,
                    "app notif", NotificationManager.IMPORTANCE_HIGH);
            mnotificationManager.createNotificationChannel(notificationChannel);
        }

        user_regis = findViewById(R.id.username_regis);
        pass_regis = findViewById(R.id.password_regis);
        tanggal = findViewById(R.id.tgl_lahir);
        login_now = findViewById(R.id.login_txt);
        btn_regis = findViewById(R.id.buttonRegister);
        logout = findViewById(R.id.logout);

        btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
            }
        });

        login_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.logoutPage();
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void addUser(){
        User user = new User();
        String username = user_regis.getText().toString();
        String password = pass_regis.getText().toString();
        String tgl_lahir = tanggal.getText().toString();

        if (username.isEmpty() || password.isEmpty() || tgl_lahir.isEmpty()){
            Toast.makeText(this,"Data tidak boleh kosong!",Toast.LENGTH_SHORT).show();
        } else if (username.isEmpty()) {
            Toast.makeText(this,"Username tidak boleh kosong!",Toast.LENGTH_SHORT).show();
        } else if (password.isEmpty()) {
            Toast.makeText(this,"password tidak boleh kosong!",Toast.LENGTH_SHORT).show();
        } else if (tgl_lahir.isEmpty()) {
            Toast.makeText(this,"Tanggal lahir tidak boleh kosong!",Toast.LENGTH_SHORT).show();
        } else {
            mDatabaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.hasChild(username)){
                        Toast.makeText(RegisterActivity.this, "Username telah terdaftar", Toast.LENGTH_SHORT).show();
                    } else {
                        user.setUsername(username);
                        user.setPassword(password);
                        user.setTgl_lahir(tgl_lahir);

                        mDatabaseReference.child(username).setValue(user);
//                        sendNotification();
                        Toast.makeText(RegisterActivity.this,"Register berhasil!",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RegisterActivity.this, rvBerita.class);
                        startActivity(intent);
                        finish();
                    }
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
                        .setContentTitle("Berhasil Register")
                        .setContentText("Register sukses!")
                        .setSmallIcon(R.drawable.ic_baseline_laptop_24).setContentIntent(notificationPendingIntent);
        return notifyBuilder;
    }

    private void sendNotification() {
        NotificationCompat.Builder notifyBuilder = getNotificationBuilder();
        mnotificationManager.notify(NOTIFICATION_ID, notifyBuilder.build());
    }

    public void showDatePicker(View view){
        DialogFragment dateFragment = new DatePickerFragment();
        dateFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        String dateMessage = day_string + "-" + month_string + "-" + year_string;
        tanggal.setText(dateMessage);

//        //Untuk menampilkan usia user
//        usia = (2022 - year);
//        String strUmur = Integer.toString(usia);
//        usiaUser.setText(strUmur);
    }
}