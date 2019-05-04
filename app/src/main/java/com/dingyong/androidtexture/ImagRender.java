package com.dingyong.androidtexture;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by：dingyong on 2019/5/4 20:23
 * email：dingyongjxnu@163.com
 */
public class ImagRender implements GLSurfaceView.Renderer {
    private Context context;
    public ImagRender(Context context){
        this.context  = context;
    }

    private BitmapTexture bitmapTexture;
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        bitmapTexture = new BitmapTexture(context);
        bitmapTexture.onSurfaceCreated();
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        //清空颜色
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        bitmapTexture.draw();
    }
}
