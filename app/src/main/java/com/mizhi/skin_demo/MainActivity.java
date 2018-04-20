package com.mizhi.skin_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.mizhi.skin_demo.adapter.MyAdapter;

import skin.support.app.SkinCompatActivity;

public class MainActivity extends SkinCompatActivity implements View.OnClickListener {
    private Button mSettingButtong;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager linearLayoutManager;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initdata();
    }

    private void initView() {
        mSettingButtong = findViewById(R.id.bt_setting);
        mRecyclerView = findViewById(R.id.rv_main);
        mSettingButtong.setOnClickListener(this);
    }

    private void initdata() {
        linearLayoutManager = new LinearLayoutManager(this);
        adapter = new MyAdapter();
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        if (view == mSettingButtong) {
            startActivity(new Intent(this, DialogActivity.class));
        }
    }
}
