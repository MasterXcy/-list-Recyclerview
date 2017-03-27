package com.example.administrator.recyclerview2.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.recyclerview2.DataModel;
import com.example.administrator.recyclerview2.R;

/**
 * Created by Administrator on 2017/3/20.
 */

public class TypeThreeViewHolder extends TypeAbstractViewHolder {
    public ImageView avatar;
    public TextView name;
    public TextView content;
    public ImageView contentImage;

    public TypeThreeViewHolder(View itemView) {
        super(itemView);
        avatar = (ImageView) itemView.findViewById(R.id.avatar2);
        name = (TextView) itemView.findViewById(R.id.name3);
        contentImage = (ImageView) itemView.findViewById(R.id.contentImage3);
        content = (TextView) itemView.findViewById(R.id.content3);

    }

    public void bindHolder(DataModel model) {
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
        contentImage.setBackgroundResource(model.contentColor);
        content.setText(model.content);
    }
}



