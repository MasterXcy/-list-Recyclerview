package com.example.administrator.recyclerview2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.administrator.recyclerview2.DataModel;
import com.example.administrator.recyclerview2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/17.
 */

public class DemoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private LayoutInflater mLayoutInflater;
    private List<DataModel> mList = new ArrayList<>();
    private Context context;

    public DemoAdapter(Context context) {
        this.context = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    public void addList(List<DataModel> list) {

        mList.addAll(list);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        switch (viewType) {
            case DataModel.TYPE_ONE:
                return new TypeOneViewHolder(mLayoutInflater.
                        inflate(R.layout.item_type_one, parent, false));
            case DataModel.TYPE_TWO:
                return new TypeTwoViewHolder(mLayoutInflater.
                        inflate(R.layout.item_type_two, parent, false));
            case DataModel.TYPE_THREE:
                return new TypeThreeViewHolder(mLayoutInflater.
                        inflate(R.layout.item_type_three, parent, false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        // ((TypeAbstractViewHolder)holder).bindHolder(mList.get(position));
        switch (viewType) {
            case DataModel.TYPE_ONE:
                ((TypeAbstractViewHolder) (holder)).bindHolder(mList.get(position));
                break;
            case DataModel.TYPE_TWO:
                ((TypeAbstractViewHolder) (holder)).bindHolder(mList.get(position));
                break;
            case DataModel.TYPE_THREE:
                ((TypeAbstractViewHolder) (holder)).bindHolder(mList.get(position));
                break;
        }
    }

    public int getItemViewType(int position) {
        return mList.get(position).type;


    }

    @Override
    public int getItemCount() {
        return mList.size();

    }


}
