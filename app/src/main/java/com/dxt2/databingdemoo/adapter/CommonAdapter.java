package com.dxt2.databingdemoo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2018/5/29 0029.
 */

public class CommonAdapter<T> extends BaseAdapter {
    private Context context;
    private List<T> list;
    private int layoutId;//item布局的id
    private int variableId;//item布局的id

    public CommonAdapter(Context context, List<T> list, int layoutId, int variableId) {
        this.context = context;
        this.list = list;
        this.layoutId = layoutId;
        this.variableId = variableId;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public T getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewDataBinding viewDataBinding = null;
        if(convertView==null){
            viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(context),layoutId,parent,false);
        }else{
            viewDataBinding = DataBindingUtil.getBinding(convertView);
        }
        viewDataBinding.setVariable(variableId,list.get(position));
        return viewDataBinding.getRoot();
    }
}
