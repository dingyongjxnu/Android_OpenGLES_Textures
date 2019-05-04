package com.dingyong.androidtexture;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/**
 * Created by：dingyong on 2019/5/4 20:16
 * email：dingyongjxnu@163.com
 */
public abstract class BaseGLSurfaceView extends GLSurfaceView {

    private GLSurfaceView.Renderer mRenderer;

    public BaseGLSurfaceView(Context context) {
        this(context, null);
    }

    public BaseGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    private void init() {
        mRenderer = getRender();
        setEGLContextClientVersion(2);
        setRenderer(mRenderer);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

    public abstract GLSurfaceView.Renderer getRender();

    public GLSurfaceView.Renderer getMyRender() {
        return mRenderer;
    }
}
