package com.example.browser;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView1;
    TextView textView2;
    ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.olaf3);
        button = findViewById(R.id.button);
        textView1=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);

        button.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this, WebViewActivity.class);
            startActivity(intent);
        });
    }


}