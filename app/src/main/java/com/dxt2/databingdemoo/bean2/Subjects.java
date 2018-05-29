package com.dxt2.databingdemoo.bean2;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.dxt2.databingdemoo.activity.RecyclerViewDetailActivity;

import java.util.List;

/**
 * Created by Administrator on 2018/5/29 0029.
 */

public class Subjects {
    private String title, year, id;

    public Subjects(String title, String year, String id) {
        this.title = title;
        this.year = year;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getId() {
        return id;
    }

    public void itemClick(View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, RecyclerViewDetailActivity.class);
//        intent.putExtra("url",url);
        context.startActivity(intent);
    }
}
