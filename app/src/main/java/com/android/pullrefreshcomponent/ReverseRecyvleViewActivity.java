package com.android.pullrefreshcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.android.pulllib.ListRefreshReverseLayout;
import com.android.pullrefreshcomponent.adapter.ReverseAdapter;

/**
 * Created by xilinch on 18-7-18 下午6:50.
 * describe 该类主要完成以下功能
 * 1.倒序的recycleview
 */

public class ReverseRecyvleViewActivity extends Activity {

    private ListRefreshReverseLayout refreshReverseLayout;

    private ReverseAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_recycleview);
    }
}
