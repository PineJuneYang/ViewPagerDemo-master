package com.pinger.demo4.fragment;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.pinger.demo4.base.BaseFragment;

/**
 * Created by Pinger on 2016/10/10.
 */
public class ActivityFragment extends BaseFragment {

    private TextView mTextView;

    @Override
    public View initView() {
        mTextView = new TextView(getActivity());
        mTextView.setGravity(Gravity.CENTER);

        mTextView.setTextSize(20);
        mTextView.setTextColor(Color.BLACK);

        return mTextView;
    }

    @Override
    public void initData() {
        Toast.makeText(getActivity(), "加载了活动数据", Toast.LENGTH_SHORT).show();
        mTextView.setText("活动视图");
    }

}
