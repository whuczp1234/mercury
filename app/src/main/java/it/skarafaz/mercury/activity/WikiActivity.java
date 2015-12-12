package it.skarafaz.mercury.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.Bind;
import butterknife.ButterKnife;
import it.skarafaz.mercury.R;

public class WikiActivity extends MercuryActivity {
    @Bind(R.id.webview)
    protected WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiki);
        ButterKnife.bind(this);
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/wiki/index.html");
    }
}
