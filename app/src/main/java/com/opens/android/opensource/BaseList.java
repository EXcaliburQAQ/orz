package com.opens.android.opensource;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * Created by ttc on 2017/3/16.
 */

public abstract class BaseList extends Fragment{
    Fragment BaseFragment;
    public BaseList(Fragment fragment){
        BaseFragment=fragment;
    }
}
