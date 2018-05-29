package com.dxt2.databingdemoo.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dxt2.databingdemoo.R;
import com.dxt2.databingdemoo.databinding.ActivityRecyclerViewDetailBinding;

public class RecyclerViewDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      setContentView(R.layout.activity_recycler_view_detail);
        ActivityRecyclerViewDetailBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_recycler_view_detail);
        binding.setUrlPath("http://pic1.win4000.com/wallpaper/4/510f446941311.jpg");
    }
}


























