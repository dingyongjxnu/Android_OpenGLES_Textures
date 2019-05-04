package com.dingyong.androidtexture;

import android.content.Context;

/**
 * Created by：dingyong on 2019/5/4 15:12
 * email：dingyongjxnu@163.com
 */
public class GLRootView extends BaseGLSurfaceView {

    public GLRootView(Context context) {
        super(context);
    }

    @Override
    public Renderer getRender() {
        return new GLRender(getContext());
    }


    public void setFilter(Filter filter) {
        GLRender render = (GLRender) getMyRender();
        render.setFilter(filter);
    }

}
