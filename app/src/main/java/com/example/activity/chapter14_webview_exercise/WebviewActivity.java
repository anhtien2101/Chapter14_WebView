package com.example.activity.chapter14_webview_exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView wv = (WebView) findViewById(R.id.webview);
        wv.loadUrl("http://www.google.com");
    }
}
