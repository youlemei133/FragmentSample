package com.chiigu.fragmentsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hudawei on 2017/2/3.
 *
 */

public class DynamicFragment extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dynamic_first,container,false);
        view.findViewById(R.id.button).setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        FragmentUtils.replaceFragment(new Dynamic2Fragment(),R.id.viewContainer,getActivity());
    }
}
