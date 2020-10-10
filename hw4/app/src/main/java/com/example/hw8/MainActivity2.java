package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b =getIntent().getExtras();
        b.getSerializable("thelist");
        thelist s = (thelist) b.getSerializable("thelist");
        ImageView img = findViewById(R.id.imageView2);
        TextView name = findViewById(R.id.textView5);
        TextView totalPages = findViewById(R.id.textView6);
        TextView authorName = findViewById(R.id.textView7);
        img.setImageResource(s.getImage());
        name.setText(s.getName());
        totalPages.setText("totalPages:"+s.getTotalPages());
        authorName.setText(s.getAuthorName());
    }
}