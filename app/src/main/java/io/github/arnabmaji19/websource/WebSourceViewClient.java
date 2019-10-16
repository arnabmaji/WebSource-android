package io.github.arnabmaji19.websource;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.ybq.android.spinkit.SpinKitView;

public class WebSourceViewClient extends WebViewClient {
    private SpinKitView spinKitView;
    WebSourceViewClient(SpinKitView spinKitView){
        this.spinKitView = spinKitView;
    }

    @Override
    public void onPageCommitVisible(WebView view, String url) {
        super.onPageCommitVisible(view, url);
        spinKitView.setVisibility(View.GONE);
    }

    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
    }
}
