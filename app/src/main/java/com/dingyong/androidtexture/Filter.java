package com.dingyong.androidtexture;

/**
 * Created by：dingyong on 2019/5/4 16:52
 * email：dingyongjxnu@163.com
 */
public enum Filter {

    NONE(0, new float[]{0.0f, 0.0f, 0.0f}),
    GRAY(1, new float[]{0.299f, 0.587f, 0.114f}),
    COOL(2, new float[]{0.0f, 0.0f, 0.1f}),
    WARM(2, new float[]{0.1f, 0.1f, 0.0f}),
    BLUR(3, new float[]{0.006f, 0.004f, 0.002f}),
    MAGN(4, new float[]{0.0f, 0.0f, 0.4f});

    private int vChangeType;
    private float[] data;

    Filter(int vChangeType, float[] data) {
        this.vChangeType = vChangeType;
        this.data = data;
    }

    public int getType() {
        return vChangeType;
    }

    public float[] data() {
        return data;
    }


}
