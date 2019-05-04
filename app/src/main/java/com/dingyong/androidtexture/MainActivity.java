package com.dingyong.androidtexture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by：dingyong on 2019/5/4 19:56
 * email：dingyongjxnu@163.com
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onImageDeal(View view){
        Intent intent = new Intent(this,ImageActivity.class);
        startActivity(intent);
    }
    public void onImageShow(View view){
        Intent intent = new Intent(this,ShowImageActivity.class);
        startActivity(intent);
    }
}
