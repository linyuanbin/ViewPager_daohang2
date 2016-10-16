package viewpager2.lin.com.viewpager_daohang2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements ViewPager.OnPageChangeListener{

    private List<Fragment> fragmentList;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;
    private List<String>title;
    private ViewPager pager;
    private PagerTitleStrip pts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentList=new ArrayList<Fragment>();  //用Fragment界面做数组元素
        fragmentList.add(new Fragment1());
        fragmentList.add(new Fragment2());
        fragmentList.add(new Fragment3());
        fragmentList.add(new Fragment4());


        //标题资源
        title=new ArrayList<String>();
        title.add("空间");
        title.add("好友");
        title.add("公众号");
        title.add("群聊");


        pager= (ViewPager) findViewById(R.id.pager);
        myFragmentPagerAdapter=new MyFragmentPagerAdapter(getSupportFragmentManager(),title,fragmentList);
        //pager.setAdapter(myFragmentPagerAdapter);
        //以上默认不会销毁多余界面 （即有几个就显示几个，不像View只加载3个）

        //若需要销毁多余的调用MyFragmentPagerAdapter
        MyFragmentPagerAdapter2 myFragmentPagerAdapter2=new MyFragmentPagerAdapter2(getSupportFragmentManager(),title,fragmentList);
        pager.setAdapter(myFragmentPagerAdapter2);
        pager.setOnPageChangeListener(this);


        //设置标题
        pts= (PagerTitleStrip) findViewById(R.id.title);
        pts.setTextSize(1,25);
        pts.setBackgroundColor(25);

    }


    //监听器的三个方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {  //0<=positionOffset<=1    0<=positionOffsetPixels<=720

        //Toast.makeText(this,"state="+position+"positionOffset="+positionOffset+" positionOffsetPixels="+positionOffsetPixels,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageSelected(int position) {  //参数position表示当前所在的页面号数
        Toast.makeText(MainActivity.this,"当前页面="+position,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //Toast.makeText(this,"state="+state,Toast.LENGTH_SHORT).show();
    }
}
