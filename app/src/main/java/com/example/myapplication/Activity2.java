package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.Activity2Binding;
import com.example.myapplication.databinding.ActivityMainBinding;

public class Activity2 extends AppCompatActivity {

    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(Activity2.this, MainActivity.class);
                startActivity(intento2);
            }
        });

        binding.bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento =new Intent(Activity2.this, Activity3.class);
                startActivity(intento);
            }
        });
    }
}