package cn.ityun.com.cniao5.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.jaeger.library.StatusBarUtil;

import cn.ityun.com.cniao5.R;

/**
 * Created by Administrator on 2016/9/13 0013.
 */
public class HomeFragment extends Fragment {

    private SliderLayout mSliderlayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        StatusBarUtil.setTranslucentForImageViewInFragment(getActivity(), 80, view.findViewById(R.id.text));

        mSliderlayout = (SliderLayout) view.findViewById(R.id.slider);
        initSlider();
        return view;
    }

    /**
     * 初始化Slider的数据
     */
    private void initSlider() {
        TextSliderView textSliderView = new TextSliderView(this.getContext());
        textSliderView.description("新品推荐");
        textSliderView.image("http://m.360buyimg.com/mobilecms/s300x98_jfs/t2416/102/20949846/13425/a3027ebc/55e6d1b9Ne6fd6d8f.jpg");
        textSliderView.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(getContext(),"新品推荐",Toast.LENGTH_SHORT).show();
            }
        });

        TextSliderView textSliderView1 = new TextSliderView(this.getContext());
        textSliderView1.description("时尚男装");
        textSliderView1.image("http://m.360buyimg.com/mobilecms/s300x98_jfs/t1507/64/486775407/55927/d72d78cb/558d2fbaNb3c2f349.jpg");
        textSliderView1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(getContext(),"时尚男装",Toast.LENGTH_SHORT).show();
            }
        });

        TextSliderView textSliderView2 = new TextSliderView(this.getContext());
        textSliderView2.description("家电秒杀");
        textSliderView2.image("http://m.360buyimg.com/mobilecms/s300x98_jfs/t1363/77/1381395719/60705/ce91ad5c/55dd271aN49efd216.jpg");
        textSliderView2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView slider) {
                Toast.makeText(getContext(),"家电秒杀",Toast.LENGTH_SHORT).show();
            }
        });

        mSliderlayout.addSlider(textSliderView1);
        mSliderlayout.addSlider(textSliderView);
        mSliderlayout.addSlider(textSliderView2);

        mSliderlayout.setPresetIndicator(SliderLayout.PresetIndicators.Right_Bottom);
        mSliderlayout.setPresetTransformer(SliderLayout.Transformer.values()[1]);
        mSliderlayout.setDuration(3000);
    }


}
