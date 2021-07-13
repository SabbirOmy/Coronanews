package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class iecdr extends AppCompatActivity {

    WebView idr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iecdr);

        idr = (WebView)findViewById(R.id.ied);
        idr.loadUrl("https://www.iedcr.gov.bd/website/index.php/component/content/article/73-ncov-2019");
    }
}
