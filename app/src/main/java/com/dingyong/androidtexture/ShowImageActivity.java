package com.dingyong.androidtexture;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by：dingyong on 2019/5/4 20:16
 * email：dingyongjxnu@163.com
 */
public class ShowImageActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ImageGlView(this));
    }
}
