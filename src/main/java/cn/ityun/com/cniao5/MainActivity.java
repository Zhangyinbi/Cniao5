package cn.ityun.com.cniao5;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

import cn.ityun.com.cniao5.bean.Tab;
import cn.ityun.com.cniao5.fragment.CartFragment;
import cn.ityun.com.cniao5.fragment.CateGoryFragment;
import cn.ityun.com.cniao5.fragment.HomeFragment;
import cn.ityun.com.cniao5.fragment.HotFragment;
import cn.ityun.com.cniao5.fragment.MineFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentTabHost mTabhost;
    private LayoutInflater mInflater;
    private List<Tab> mTabs = new ArrayList<Tab>(5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initTab();
    }

    private void initTab() {
        Tab home = new Tab(R.string.home, HomeFragment.class, R.drawable.selector_icon_home);
        Tab hot = new Tab(R.string.hot, HotFragment.class,R.drawable.selector_icon_hot);
        Tab category = new Tab(R.string.category, CateGoryFragment.class, R.drawable.selector_icon_cate);
        Tab cart = new Tab(R.string.cart, CartFragment.class, R.drawable.selector_icon_cart);
        Tab mine = new Tab(R.string.mine, MineFragment.class,R.drawable.selector_icon_mine);
        mTabs.add(home);
        mTabs.add(hot);
        mTabs.add(category);
        mTabs.add(cart);
        mTabs.add(mine);
        mInflater = LayoutInflater.from(this);
        mTabhost = (FragmentTabHost) findViewById(R.id.tabhost);
        mTabhost.setup(this, getSupportFragmentManager(), R.id.realTabContent);
        for (Tab tab : mTabs) {
            TabHost.TabSpec tabSpec = mTabhost.newTabSpec(getString(tab.getTitle()));
            tabSpec.setIndicator(buildIndicator(tab));
            mTabhost.addTab(tabSpec, tab.getFragment(), null);
        }
    }

    private View buildIndicator(Tab tab) {
        View view = mInflater.inflate(R.layout.tab_indicator, null);
        ImageView img = (ImageView) view.findViewById(R.id.icon_tab);
        TextView text = (TextView) view.findViewById(R.id.text_indicator);
        img.setImageResource(tab.getIcon());
        text.setText(tab.getTitle());
        return view;
    }
}
