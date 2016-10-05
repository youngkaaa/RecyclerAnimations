package com.example.youngkaaa.recyclerviewanims;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by : youngkaaa on 2016/8/31.
 * Contact me : 645326280@qq.com
 */
public class MetricUtils {
    public static float getDensity(Context context){
        DisplayMetrics metrics=new DisplayMetrics();
        WindowManager manager= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        manager.getDefaultDisplay().getMetrics(metrics);
        return metrics.density;
    }

    public static float getScrWidth(Context context){
        DisplayMetrics metrics=new DisplayMetrics();
        WindowManager manager= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        manager.getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }

    public static float getScrHeight(Context context){
        DisplayMetrics metrics=new DisplayMetrics();
        WindowManager manager= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        manager.getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;
    }

    public static float dp2px(Context context,int dpVal){
        float scale=getDensity(context);
        return (dpVal*scale+0.5f);
    }

    public static float px2dp(Context context,int pxVal){
        float scale=getDensity(context);
        return (pxVal/scale+0.5f);
    }

}