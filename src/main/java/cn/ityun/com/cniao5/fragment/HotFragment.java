package cn.ityun.com.cniao5.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jaeger.library.StatusBarUtil;

import cn.ityun.com.cniao5.R;

/**
 * Created by Administrator on 2016/9/13 0013.
 */
public class HotFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.hot_fragment,container,false);
        StatusBarUtil.setTranslucentForImageViewInFragment(getActivity(),80, view.findViewById(R.id.text));
        return view;
    }
}
