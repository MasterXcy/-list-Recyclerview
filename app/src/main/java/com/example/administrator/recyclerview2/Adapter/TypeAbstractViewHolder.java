package com.example.administrator.recyclerview2.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.administrator.recyclerview2.DataModel;

/**
 * Created by Administrator on 2017/3/20.
 */

public abstract class TypeAbstractViewHolder extends RecyclerView.ViewHolder {
    public TypeAbstractViewHolder(View itemView) {
        super(itemView);
    }

    public void bindHolder(DataModel model) {
    }
}
