package com.android.pullrefreshcomponent.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.pulllib.PlusRecyclerAdapter;
import com.android.pullrefreshcomponent.R;

import java.util.List;

/**
 * Created by xilinch on 18-7-22 下午8:05.
 * describe 该类主要完成以下功能
 * 1.显示评论列表
 */

public class ReverseAdapter extends PlusRecyclerAdapter {

    private List<Integer> list;

    private Context context;

    public ReverseAdapter(List<Integer> list,Context context){
        super(null);
        this.context = context;
        this.list = list;
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_test, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if(viewHolder instanceof CustomHeaderAdapter.ItemViewHolder){

            CustomHeaderAdapter.ItemViewHolder holder = (CustomHeaderAdapter.ItemViewHolder) viewHolder;
            holder.tv.setText(String.valueOf(list.get(i)));
        }
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        TextView tv;

        public ItemViewHolder(View view){
            super(view);
            tv= (TextView) view.findViewById(R.id.tv);
        }
    }
}
