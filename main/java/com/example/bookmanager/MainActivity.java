package com.example.bookmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button insert,show,manipulate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        insert=findViewById(R.id.insert);
        manipulate=findViewById(R.id.manipulate);
        show=findViewById(R.id.show);
        insert.setOnClickListener(this);
        manipulate.setOnClickListener(this);
        show.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.equals(insert)) {
            Intent it = new Intent(this, AddActivity.class);
            startActivity(it);
        }
        if(view.equals(manipulate)) {
            Intent it = new Intent(this, UpdateActivity.class);
            startActivity(it);
        }
        if(view.equals(show)) {
            Intent it = new Intent(this, ShowActivity.class);
            startActivity(it);
        }

    }
}