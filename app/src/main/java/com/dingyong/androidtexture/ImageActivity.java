package com.dingyong.androidtexture;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class ImageActivity extends AppCompatActivity {
    private GLRootView mGLRootView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGLRootView = new GLRootView(this);
        setContentView(mGLRootView);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_filter,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.mDefault:
                mGLRootView.setFilter(Filter.NONE);
                break;
            case R.id.mGray:
                mGLRootView.setFilter(Filter.GRAY);
                break;
            case R.id.mCool:
                mGLRootView.setFilter(Filter.COOL);
                break;
            case R.id.mWarm:
                mGLRootView.setFilter(Filter.WARM);
                break;
            case R.id.mBlur:
                mGLRootView.setFilter(Filter.BLUR);
                break;
            case R.id.mMagn:
                mGLRootView.setFilter(Filter.MAGN);
                break;

        }
        mGLRootView.requestRender();
        return super.onOptionsItemSelected(item);
    }
}
