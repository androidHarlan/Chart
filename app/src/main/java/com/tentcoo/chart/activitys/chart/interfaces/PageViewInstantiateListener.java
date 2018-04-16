package com.tentcoo.chart.activitys.chart.interfaces;

import android.view.View;
import android.view.ViewGroup;

import com.tentcoo.chart.activitys.chart.mode.PageEntity;


public interface PageViewInstantiateListener<T extends PageEntity> {

    View instantiateItem(ViewGroup container, int position, T pageEntity);
}
