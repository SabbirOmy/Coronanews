package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class indepen extends AppCompatActivity {

    WebView de;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indepen);

        de = (WebView)findViewById(R.id.pen);
        de.loadUrl("http://independent24.com/");
    }
}
