package com.example.byun.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by byun on 2018-03-06.
 */

public class mAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Data> datas;

    public void setDatas(ArrayList<Data> datas) {
        this.datas = datas;
    }






    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_items,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        int positionInList = position % datas.size();
        Data data = datas.get(positionInList);
        holder.text.setText(data.getName());

    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }



}
