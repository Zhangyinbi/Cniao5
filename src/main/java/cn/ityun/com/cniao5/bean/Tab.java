package cn.ityun.com.cniao5.bean;

/**
 * Created by Administrator on 2016/9/13 0013.
 */
public class Tab {
    private int title;
    private int icon;
    private Class fragment;

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public Class getFragment() {
        return fragment;
    }

    public void setFragment(Class fragment) {
        this.fragment = fragment;
    }

    public Tab(int title, Class fragment, int icon) {
        this.title = title;
        this.fragment = fragment;
        this.icon = icon;

    }
}
