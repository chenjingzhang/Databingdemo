package com.dxt2.databingdemoo.activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dxt2.databingdemoo.R;
import com.dxt2.databingdemoo.databinding.ActivityDetailBinding;
import com.dxt2.databingdemoo.databinding.ActivityMainBinding;
import com.dxt2.databingdemoo.https.Https;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_detail);
        ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        Https.loadTextData2(binding,"https://api.douban.com/v2/movie/");
    }
}
