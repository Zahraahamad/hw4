package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<thelist> library = new ArrayList<>();
        thelist c1 = new thelist("The metamorphosis","Franz Kafka",R.drawable.m ,58);
        thelist c2 = new thelist("Animal farm", "george orwell",R.drawable.animal2,112);
        thelist c3 = new thelist("Crime and punishment", "Fyodor Dostoevsky",R.drawable.s,576);
        thelist c4 = new thelist(" The inferno", "Dante alighieri",R.drawable.i,609);
        thelist c5 = new thelist("Little women", "Louisa May Alcott",R.drawable.little,112);
        thelist c6 = new thelist("The Hobbit", "R.R.Tolkien",R.drawable.t,310);
        thelist c7 = new thelist("The three sisters", "Anton checkov",R.drawable.a,81);
        thelist c8 = new thelist("The raven", "Edger allan poe",R.drawable.rr,42);
        thelist c9 = new thelist("1884", "george orwell",R.drawable.g,328);
        thelist c10 = new thelist("The prophet", "Kahlil jubran",R.drawable.p,107);


        library.add(c1);
        library.add(c2);
        library.add(c3);
        library.add(c4);
        library.add(c5);
        library.add(c6);
        library.add(c7);
        library.add(c8);
        library.add(c9);
        library.add(c10);

        RecyclerView hi = findViewById(R.id.hi);
        hi.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        hi.setLayoutManager(lm);
        hi.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        classAdapter i = new classAdapter(library,this);

        hi.setAdapter(i);



    }



    }

