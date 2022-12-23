package com.example.uasberita;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
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

public class MainActivity extends AppCompatActivity {
    EditText user_log, pass_log;
    TextView regis_now;
    Button btn_log;

    DatabaseReference mDatabaseReference;

    private NotificationManager mnotificationManager;
    private final static String CHANNEL_ID = "primary-channel";
    private int NOTIFICATION_ID = 0;

    private boolean login_user = false;
    public static SharedPreferences sharedPreferences;
    public static final String sharedPrefPackage = "com.example.uasberita";
    static String USERNAME_KEY = "username-key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_log = findViewById(R.id.username_login);
        pass_log = findViewById(R.id.password_login);
        regis_now = findViewById(R.id.register_txt);
        btn_log = findViewById(R.id.button_login);

        mnotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,
                    "app notif", NotificationManager.IMPORTANCE_HIGH);
            mnotificationManager.createNotificationChannel(notificationChannel);
        }

        mDatabaseReference = FirebaseDatabase.getInstance().getReference().child("User");

        // Mengatur shared preference
        sharedPreferences = getSharedPreferences(sharedPrefPackage, MODE_PRIVATE);

        login_user = sharedPreferences.getBoolean(USERNAME_KEY, false);
        if (login_user){
            Intent intent = new Intent(MainActivity.this, rvBerita.class);
            startActivity(intent);
        }

        regis_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });
    }

    private void loginUser() {
        String username = user_log.getText().toString();
        String password = pass_log.getText().toString();

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this,"Data tidak boleh kosong!",Toast.LENGTH_SHORT).show();
        } else if (username.isEmpty()) {
            Toast.makeText(this,"Username tidak boleh kosong!",Toast.LENGTH_SHORT).show();
        } else if (password.isEmpty()) {
            Toast.makeText(this,"password tidak boleh kosong!",Toast.LENGTH_SHORT).show();
        } else {
            mDatabaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.hasChild(username)){
                        String passwordFirebase = snapshot.child(username).child("password").getValue(String.class);
                        if (passwordFirebase.equals(password)) {
//                            Toast.makeText(MainActivity.this, "Login sukses!",Toast.LENGTH_SHORT).show();
                            sendNotification();
                            login_user = true;
                            Intent intent = new Intent(MainActivity.this, rvBerita.class);
                            savePage();
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(MainActivity.this, "Username atau Password salah!",Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(MainActivity.this, "Username atau Password salah!",Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }
    }

    private void savePage() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(USERNAME_KEY, login_user);
        editor.apply();
    }

    static void logoutPage() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(USERNAME_KEY, false);
        editor.apply();
    }

    private NotificationCompat.Builder getNotificationBuilder() {
        Intent notificationIntent = new Intent(this, rvBerita.class);
        PendingIntent notificationPendingIntent = PendingIntent
                .getActivity(this, NOTIFICATION_ID, notificationIntent,
                        PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder notifyBuilder =
                new NotificationCompat.Builder(this, CHANNEL_ID)
                        .setContentTitle("Berhasil Login")
                        .setContentText("Login sukses!")
                        .setSmallIcon(R.drawable.ic_baseline_laptop_24).setContentIntent(notificationPendingIntent);
        return notifyBuilder;
    }

    private void sendNotification() {
        NotificationCompat.Builder notifyBuilder = getNotificationBuilder();
        mnotificationManager.notify(NOTIFICATION_ID, notifyBuilder.build());
    }
}