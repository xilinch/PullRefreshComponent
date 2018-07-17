package com.android.pulllib.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;


public class ToastUtils {

    private static Toast toast;
    private static Handler handler = new Handler(Looper.getMainLooper());

    // toast重复显示不消失问题
    public static void toastShow(final Context context, final int arg) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (toast == null) {
                    toast = Toast.makeText(context, arg, Toast.LENGTH_SHORT);
                } else {
                    // toast.cancel(); //取消后只会显示一次
                    toast.setText(arg);
                }
                if (toast != null && context != null) {
                    toast.show();
                }
            }
        });
    }

    // toast重复显示不消失问题
    public static void toastShowLong(final Context context, final String arg) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (toast == null) {
                    toast = Toast.makeText(context, arg, Toast.LENGTH_LONG);
                } else {
                    // toast.cancel(); //取消后只会显示一次
                    toast.setText(arg);
                }
                if (toast != null && context != null) {
                    toast.show();
                }
            }
        });
    }

    // toast重复显示不消失问题
    public static void toastShowLong(final Context context, final int arg) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (toast == null) {
                    toast = Toast.makeText(context, arg, Toast.LENGTH_LONG);
                } else {
                    // toast.cancel(); //取消后只会显示一次
                    toast.setText(arg);
                }
                if (toast != null && context != null) {
                    toast.show();
                }
            }
        });
    }

    // toast重复显示不消失问题
    public static void toastShow(final Context context, final String arg) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (toast == null) {
                    toast = Toast.makeText(context, arg, Toast.LENGTH_SHORT);
                } else {
                    // toast.cancel(); //取消后只会显示一次
                    toast.setText(arg);
                }
                if (toast != null && context != null) {
                    toast.show();
                }
            }
        });
    }

}
