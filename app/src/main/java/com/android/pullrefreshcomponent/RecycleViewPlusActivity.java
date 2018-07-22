package com.android.pullrefreshcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;

import com.android.pulllib.IRefreshHandler;
import com.android.pulllib.RefreshLayout;
import com.android.pullrefreshcomponent.adapter.RecycleViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xilinch on 18-7-18 下午6:49.
 * describe 该类主要完成以下功能
 * 1.recyleView Demo
 *
 */

public class RecycleViewPlusActivity extends Activity {


    private RefreshLayout refreshLayout;

    private RecycleViewAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        refreshLayout = (RefreshLayout)findViewById(R.id.refreshLayout);
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ;i < 10; i++){
            list.add(i);
        }
        adapter = new RecycleViewAdapter(list, this);

        refreshLayout.setRecyclerAdapter(adapter);
        refreshLayout.setRecyclerLayoutManager(new LinearLayoutManager(this));

        refreshLayout.setHandler(new IRefreshHandler() {
            @Override
            public boolean canRefresh() {
                return true;
            }

            @Override
            public boolean canLoad() {
                return false;
            }

            @Override
            public void refresh(int requestPage) {
                loadData(0);
            }

            @Override
            public void load(int requestPage) {
                loadData(requestPage);
            }
        });

    }


    private void loadData(int requestPage){
        try{
            Thread.sleep(2000);
            List<Integer> list = new ArrayList<>();

            for(int i=requestPage*10; i < (requestPage+1)*10; i++){
                list.add(i);
            }
            refreshLayout.setTotalPage(requestPage+ 2);
            if(requestPage == 0){
                refreshLayout.updateClearAndAdd(list);
            } else if(requestPage > 0){
                refreshLayout.updateAdd(list);
            }
            refreshLayout.completeRefresh(true);
        } catch (Exception exception){
           exception.printStackTrace();

        } finally{

        }


    }
}
