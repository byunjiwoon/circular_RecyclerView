package com.example.byun.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView rv;
    private mAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;

    private int MAX_ITEM_COUNT = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv = (RecyclerView)findViewById(R.id.horizon_list);
        ArrayList<Data> data = new ArrayList<>();



        data.add(new Data("홈"));
        data.add(new Data("EDITOR's CHOICE"));
        data.add(new Data("이벤트"));
        data.add(new Data("기획전"));
        data.add(new Data("아울렛"));
        data.add(new Data("NOW"));
        data.add(new Data("매거진"));


        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        rv.setLayoutManager(mLayoutManager);
        rv.getLayoutManager().scrollToPosition(Integer.MAX_VALUE / 2);

        mAdapter = new mAdapter();
        mAdapter.setDatas(data);
        rv.setAdapter(mAdapter);

    }
}
