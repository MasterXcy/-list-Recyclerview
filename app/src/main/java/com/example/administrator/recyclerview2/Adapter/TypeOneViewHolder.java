package com.example.administrator.recyclerview2.Adapter;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.recyclerview2.DataModel;
import com.example.administrator.recyclerview2.R;

/**
 * Created by Administrator on 2017/3/17.
 */

public class TypeOneViewHolder extends TypeAbstractViewHolder {
    private ImageView avatar;
    private TextView name;

    public TypeOneViewHolder(View itemView) {
        super(itemView);
        avatar = (ImageView) itemView.findViewById(R.id.avatar1);
        name = (TextView) itemView.findViewById(R.id.name1);
    }

    @Override
    public void bindHolder(DataModel model) {
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
    }


}


