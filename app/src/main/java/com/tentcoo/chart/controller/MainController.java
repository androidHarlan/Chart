package com.tentcoo.chart.controller;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;


import com.tentcoo.chart.R;
import com.tentcoo.chart.activitys.MainActivity;
import com.tentcoo.chart.activitys.fragment.ConversationListFragment;
import com.tentcoo.chart.adapter.ViewPagerAdapter;
import com.tentcoo.chart.view.MainView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${chenyn} on 2017/2/20.
 */

public class MainController implements View.OnClickListener, ViewPager.OnPageChangeListener {
    private MainView mMainView;
    private MainActivity mContext;
    private ConversationListFragment mConvListFragment;



    public MainController(MainView mMainView, MainActivity context) {
        this.mMainView = mMainView;
        this.mContext = context;
        setViewPager();
    }

    private void setViewPager() {
        final List<Fragment> fragments = new ArrayList<>();
        // init Fragment
        mConvListFragment = new ConversationListFragment();


        fragments.add(mConvListFragment);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(mContext.getSupportFragmentManger(),
                fragments);
        mMainView.setViewPagerAdapter(viewPagerAdapter);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.actionbar_msg_btn:
                mMainView.setCurrentItem(0, false);
                break;

        }
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mMainView.setButtonColor(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public void sortConvList() {
        mConvListFragment.sortConvList();
    }


}