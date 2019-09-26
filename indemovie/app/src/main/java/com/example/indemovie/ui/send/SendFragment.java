package com.example.indemovie.ui.send;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.indemovie.R;
import com.example.indemovie.ui.slideshow.SlideshowFragment;

public class SendFragment extends Fragment {

    final SlideshowFragment slideshowFragment = new SlideshowFragment();
    int ps=slideshowFragment.getArg();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LayoutInflater lf = getActivity().getLayoutInflater();
        View view=lf.inflate(R.layout.fragment_send,container,false);
        WebView webView = view.findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient()); // 클릭시 새창 안뜨게
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://indiefilmseoul.org/");

        return view;


    }
}
