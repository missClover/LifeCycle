package com.example.administrator.lifecycle;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/13.
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();
//    添加一个活动到List
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
//    从List移除一个活动
    public static  void removeActivity(Activity activity){
        activities.remove(activity);
    }
//    将List中存储的活动全部销毁
    public static void finishAll(){
        for (Activity activity : activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}
