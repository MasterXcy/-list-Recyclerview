package com.example.administrator.recyclerview2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.administrator.recyclerview2.Adapter.DemoAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerview;
    private DemoAdapter mAdaper;
    private int colors[] = {android.R.color.holo_red_dark,
            android.R.color.holo_orange_dark, android.R.color.holo_orange_light};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        GridLayoutManager gridLayout = new GridLayoutManager(this, 2);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mAdaper = new DemoAdapter(this);
        mRecyclerview.setAdapter(mAdaper);
        initData();
        notifyDataChange();
    }

    protected void initData() {
        List<DataModel> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int type = (int) ((Math.random() * 3) + 1);
            DataModel data = new DataModel();
            data.avatarColor = colors[type - 1];
            data.type = type;
            data.name = "name:" + i;
            data.content = "content:" + i;
            data.contentColor = colors[(type + 1) % 3];
            list.add(data);
        }
        mAdaper.addList(list);
        mAdaper.notifyDataSetChanged();
    }
}


