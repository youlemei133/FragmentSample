package com.chiigu.fragmentsample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hudawei on 2017/2/3.
 *
 */

public class StaticFragment extends Fragment implements View.OnClickListener{
    private CallBack callBack;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_static,container,false);
        view.findViewById(R.id.button1).setOnClickListener(this);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof CallBack){
            callBack= (CallBack) context;
        }else{
            throw new ClassCastException("使用StaticFragment所属Activity,需要实现CallBack接口");
        }

    }


    public void fragmentMethod(){
        Log.e("StaticFragment","Fragment收到Activity发送的消息");
    }

    @Override
    public void onClick(View view) {
        callBack.callBack();
    }

    public interface CallBack{
        void callBack();
    }
}
