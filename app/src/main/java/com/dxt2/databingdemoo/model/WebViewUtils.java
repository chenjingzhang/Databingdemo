package com.dxt2.databingdemoo.model;

import android.databinding.BindingAdapter;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Administrator on 2018/5/29 0029.
 */

public class WebViewUtils {
    @BindingAdapter({"webUrl"})
    public static void loadWeb(WebView webView, String url){
        if(url == null){
            return;
        }else{
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(url);
        }

    }

}
