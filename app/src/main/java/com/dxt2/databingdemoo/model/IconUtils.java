package com.dxt2.databingdemoo.model;

import android.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.dxt2.databingdemoo.R;
import com.makeramen.roundedimageview.RoundedImageView;

/**
 * Created by Administrator on 2018/5/29 0029.
 */

public class IconUtils {
    @BindingAdapter({"imageUrl"})
    public static void loadImage(RoundedImageView imageView,String url){
        if(url ==null){
            imageView.setImageResource(R.mipmap.ic_launcher);
        }
        else{
            Glide.with(imageView.getContext()).load(url)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(imageView);
        }
    }
}
