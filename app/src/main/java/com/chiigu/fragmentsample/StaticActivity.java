package com.chiigu.fragmentsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by hudawei on 2017/2/3.
 *
 */

public class StaticActivity extends AppCompatActivity implements StaticFragment.CallBack,View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void callBack() {
        Log.e("StaticActivity","Activity收到Fragment发送的消息");
    }

    @Override
    public void onClick(View view) {
        StaticFragment fragment= (StaticFragment) getSupportFragmentManager().findFragmentById(R.id.static_fragment);
        if(fragment!=null){
            fragment.fragmentMethod();
        }
    }
}
