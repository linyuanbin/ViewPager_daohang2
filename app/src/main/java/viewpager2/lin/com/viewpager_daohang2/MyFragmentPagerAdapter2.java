package viewpager2.lin.com.viewpager_daohang2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lin on 2016/9/6.
 * 需要销毁后台界面时调用这个代码
 */
public class MyFragmentPagerAdapter2 extends FragmentStatePagerAdapter{
    private List<String>title;
    private List<Fragment>fragmentList;

    public MyFragmentPagerAdapter2(FragmentManager fm, List<String>title, List<Fragment>fragmentList) {
        super(fm);
        this.title=title;
        this.fragmentList=fragmentList;
    }


    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    /*
    设置标题函数
     */

    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }


    /*
    需要销毁后台View时多调用了这个方法
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
