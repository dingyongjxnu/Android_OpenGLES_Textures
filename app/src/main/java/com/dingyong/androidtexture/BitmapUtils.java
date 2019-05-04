package com.dingyong.androidtexture;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by：dingyong on 2019/5/4 15:17
 * email：dingyongjxnu@163.com
 */
public class BitmapUtils {
    public static Bitmap getBitmap(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.icon);

    }

    public static Bitmap getBitmap(Context context, int resID) {
        return BitmapFactory.decodeResource(context.getResources(), resID);
    }
}
