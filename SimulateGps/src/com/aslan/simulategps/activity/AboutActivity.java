package com.aslan.simulategps.activity;

import android.view.View;
import android.view.View.OnClickListener;

import com.aslan.simulategps.R;
import com.aslan.simulategps.base.BaseActivity;

public class AboutActivity extends BaseActivity implements OnClickListener {

    @Override
    protected Object getContentViewId() {
        return R.layout.activity_about;
    }

    @Override
    protected void IniView() {
        toolbar.setTitle("关于");// 标题的文字需在setSupportActionBar之前，不然会无效
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void IniLister() {
        toolbar.setNavigationOnClickListener(this);
    }

    @Override
    protected void IniData() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void thisFinish() {
        this.finish();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
        case -1:
            thisFinish();
            break;
        }
    }

}
