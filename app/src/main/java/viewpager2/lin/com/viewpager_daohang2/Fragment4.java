package viewpager2.lin.com.viewpager_daohang2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lin on 2016/9/6.
 */
public class Fragment4 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        
        return inflater.inflate(R.layout.view4,container,false);
    }

    @Override
    public void onDestroy() {//测试用
        super.onDestroy();
        Log.i("Main","销毁");
    }
}
