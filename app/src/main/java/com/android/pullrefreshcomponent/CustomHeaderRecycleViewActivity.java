package com.android.pullrefreshcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by xilinch on 18-7-18 下午6:58.
 * describe 该类主要完成以下功能
 * 1.带顶部搜索栏的recycleview
 */

public class CustomHeaderRecycleViewActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_header_recycleview);
    }
}
