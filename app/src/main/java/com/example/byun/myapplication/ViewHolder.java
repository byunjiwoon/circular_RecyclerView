package com.example.byun.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by byun on 2018-03-06.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView text;

    public ViewHolder(View itemView){
        super(itemView);

        text = (TextView)itemView.findViewById(R.id.description);
    }


}
