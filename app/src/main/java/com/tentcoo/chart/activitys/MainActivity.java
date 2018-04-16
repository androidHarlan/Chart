package com.tentcoo.chart.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;


import com.tentcoo.chart.R;
import com.tentcoo.chart.controller.MainController;
import com.tentcoo.chart.view.MainView;

import cn.jiguang.api.JCoreInterface;


public class MainActivity extends FragmentActivity {
    private MainController mMainController;
    private MainView mMainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mMainView = (MainView) findViewById(R.id.main_view);
        mMainView.initModule();
        mMainController = new MainController(mMainView, this);

        mMainView.setOnClickListener(mMainController);
        mMainView.setOnPageChangeListener(mMainController);
    }

    public FragmentManager getSupportFragmentManger() {
        return getSupportFragmentManager();
    }

    @Override
    protected void onPause() {
        JCoreInterface.onPause(this);
        super.onPause();
    }

    @Override
    protected void onResume() {
        JCoreInterface.onResume(this);
        mMainController.sortConvList();
        super.onResume();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

  /*  @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return keyCode == KeyEvent.KEYCODE_BACK;
    }*/

    @Override
    protected void onNewIntent(Intent intent) {
        Log.e("backinfo","intent");
        super.onNewIntent(intent);
    }
}
