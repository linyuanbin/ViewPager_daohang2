package viewpager2.lin.com.viewpager_daohang2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

/**
 * Created by lin on 2016/9/6.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter{
    private List<String>title;
    private List<Fragment>fragmentList;

    public MyFragmentPagerAdapter(FragmentManager fm,List<String>title,List<Fragment>fragmentList) {
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
}
