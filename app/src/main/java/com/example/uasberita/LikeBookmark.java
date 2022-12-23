package com.example.uasberita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class LikeBookmark extends AppCompatActivity {
    private Context context;
    private RecyclerView rvLike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like_bookmark);

        context = LikeBookmark.this;
        rvLike = findViewById(R.id.rv_Like);
    }
}