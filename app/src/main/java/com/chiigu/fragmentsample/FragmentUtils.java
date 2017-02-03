package com.chiigu.fragmentsample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by hudawei on 2017/2/3.
 *
 */

public class FragmentUtils {
    public static void replaceFragment(Fragment fragment, int viewContainer, FragmentActivity activity) {
        FragmentManager fm=activity.getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();   //提供添加、移除、替换片段以及执行其他片段事务
        ft.replace(viewContainer,fragment);     //替换View容器里面的Fragment为另一个Fragment
        ft.addToBackStack(null);    //将被替换的Fragment添加到返回栈中，该Fragment不会被销毁。在用户按返回键时，该片段重新启动
        ft.commit();
    }

    public static void addFragment(Fragment fragment,int viewContainer, FragmentActivity activity) {
        FragmentManager fm=activity.getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();   //提供添加、移除、替换片段以及执行其他片段事务
        ft.add(viewContainer,fragment);     //添加Fragment到指定的View容器
        ft.commit();    //提交事物
    }
}
