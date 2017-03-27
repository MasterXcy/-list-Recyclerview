package com.example.administrator.recyclerview2.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.recyclerview2.DataModel;
import com.example.administrator.recyclerview2.R;

/**
 * Created by Administrator on 2017/3/17.
 */

public class TypeTwoViewHolder extends TypeAbstractViewHolder {
    public ImageView avatar;
    public TextView name;
    public TextView content;

    public TypeTwoViewHolder(View itemView) {
        super(itemView);
        avatar = (ImageView) itemView.findViewById(R.id.avatar2);
        name = (TextView) itemView.findViewById(R.id.name2);
        content = (TextView) itemView.findViewById(R.id.content2);
    }

    public void bindHolder(DataModel model) {
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
        content.setText(model.content);
    }
}


