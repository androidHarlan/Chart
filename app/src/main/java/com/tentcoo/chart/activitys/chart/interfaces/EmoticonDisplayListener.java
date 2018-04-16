package com.tentcoo.chart.activitys.chart.interfaces;

import android.view.ViewGroup;

import com.tentcoo.chart.activitys.chart.adapter.EmoticonsAdapter;


public interface EmoticonDisplayListener<T> {

    void onBindView(int position, ViewGroup parent, EmoticonsAdapter.ViewHolder viewHolder, T t, boolean isDelBtn);
}
