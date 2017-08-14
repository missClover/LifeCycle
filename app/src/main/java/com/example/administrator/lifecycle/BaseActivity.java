package com.example.administrator.lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Administrator on 2017/8/13.
 */

public class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        实现查看当前的活动名称
        Log.e("BaseActivity",getClass().getSimpleName());
//        实现随时随地退出程序,将全部正在创建的活动全部添加到活动管理器中
    ActivityCollector.addActivity(this);
    }
//    一个马上要销毁的活动从活动管理器中移除
//    重写onDestroy方法实现
//    最后在其他活动中调用ActivityCollector。finishAll（）方法即可

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
