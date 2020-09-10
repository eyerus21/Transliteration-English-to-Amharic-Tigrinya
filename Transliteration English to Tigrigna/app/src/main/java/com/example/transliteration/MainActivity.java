package com.example.transliteration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText Number;
    public Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number =(EditText) findViewById(R.id.editText4);
        ok =(Button)findViewById(R.id.button);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Number.getText().toString());

            }

        });

    }
    public void validate(String NNumber) {
        if (NNumber.equals("1")) {
            Intent I = new Intent(MainActivity.this, SecondActivity.class);

            startActivity(I);
        }
        else if(NNumber.equals("2") )
        {
            Intent In = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(In);
        }
        else{




}}}
