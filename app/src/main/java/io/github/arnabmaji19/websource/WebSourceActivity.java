package io.github.arnabmaji19.websource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.github.ybq.android.spinkit.SpinKitView;

public class WebSourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_source);

        String requestedUrl = getIntent().getStringExtra("requested_url");
        String sourceUrl = "view-source:" + requestedUrl;
        SpinKitView spinKitView = findViewById(R.id.spin_kit);
        WebView webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebSourceViewClient(spinKitView));
        webView.loadUrl(sourceUrl);
    }
}
