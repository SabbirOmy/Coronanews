package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class cnn extends AppCompatActivity {

    WebView cc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnn);

        cc = (WebView)findViewById(R.id.cnc);
        cc.loadUrl("https://edition.cnn.com/");
    }
}
