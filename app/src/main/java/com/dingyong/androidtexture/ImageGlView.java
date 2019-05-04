package com.dingyong.androidtexture;

import android.content.Context;

/**
 * Created by：dingyong on 2019/5/4 20:24
 * email：dingyongjxnu@163.com
 */
public class ImageGlView extends BaseGLSurfaceView {
    public ImageGlView(Context context) {
        super(context);
    }

    @Override
    public Renderer getRender() {
        return new ImagRender(getContext());
    }
}
