package com.example.bookmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity implements View.OnClickListener {


    EditText title_input, author_input, price_input;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        title_input = findViewById(R.id.title_input);
        author_input = findViewById(R.id.author_input);
        price_input = findViewById(R.id.price_input);
        add_button = findViewById(R.id.add_button);


        add_button.setOnClickListener(this);

        }

    @Override
    public void onClick(View view) {
        String name=title_input.getText().toString().trim();
        String author=author_input.getText().toString().trim();
        int price=Integer.valueOf(price_input.getText().toString().trim());
        MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
        myDB.addBook(name,author,price);
    }
}
