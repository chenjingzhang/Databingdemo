package com.dxt2.databingdemoo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dxt2.databingdemoo.bean2.Subjects;

import java.util.List;

/**
 * Created by Administrator on 2018/5/29 0029.
 */

public class RecyclerCommonAdapter2 extends RecyclerView.Adapter<RecyclerCommonAdapter2.MyViewHoler> {

    private List<Subjects> movies;
    private Context ctx;
    private int layoutId;//item布局的id
    private int variableId;//变量的id
    LayoutInflater inflater;

    public RecyclerCommonAdapter2(List<Subjects> movies, Context context, int layoutId, int variableId) {
        this.movies = movies;
        this.ctx = context;
        this.layoutId = layoutId;
        this.variableId = variableId;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public MyViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, layoutId, parent, false);
        View view = binding.getRoot();
        MyViewHoler myViewHoler = new MyViewHoler(view);
        myViewHoler.setViewDataBinding(binding);
        return myViewHoler;
    }

    @Override
    public void onBindViewHolder(MyViewHoler holder, int position) {
        holder.getViewDataBinding().setVariable(variableId, movies.get(position));
        //当数据改变时，binding会在下一帧去改变数据，如果我们需要立即改变，就去调用executePendingBindings方法。
        holder.getViewDataBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class MyViewHoler extends RecyclerView.ViewHolder {
        private ViewDataBinding viewDataBinding;

        public MyViewHoler(View itemView) {
            super(itemView);
        }

        public ViewDataBinding getViewDataBinding() {
            return viewDataBinding;
        }

        public void setViewDataBinding(ViewDataBinding viewDataBinding) {
            this.viewDataBinding = viewDataBinding;
        }
    }
}
