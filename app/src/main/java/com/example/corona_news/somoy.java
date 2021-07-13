package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class somoy extends AppCompatActivity {

    WebView smy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somoy);

        smy = (WebView)findViewById(R.id.sm);
        smy.loadUrl("https://www.somoynews.tv/");
    }
}
