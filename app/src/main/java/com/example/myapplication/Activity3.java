package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.myapplication.databinding.Activity3Binding;

public class Activity3 extends AppCompatActivity {

    private Activity3Binding binding;
    // se crea el webview
    private WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity3Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        // se hace el binding
        wv1 = binding.wv1;
        // la vista
        wv1.setWebViewClient(new WebViewClient());
        // se habilita javascript para poder ver la url de google maps
        WebSettings webSettings = wv1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // se ingresa la url
        wv1.loadUrl("https://goo.gl/maps/L1Y1YfnUahXsEUoz8");


        binding.bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(Activity3.this, Activity2.class);
                startActivity(intento);
            }
        });

        binding.bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }

}