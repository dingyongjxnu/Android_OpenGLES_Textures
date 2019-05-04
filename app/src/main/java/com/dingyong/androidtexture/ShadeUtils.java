package com.dingyong.androidtexture;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;

import java.io.InputStream;

/**
 * Created by：dingyong on 2019/5/4 16:16
 * email：dingyongjxnu@163.com
 */
public class ShadeUtils {

    public static String loadFromAssetsFile(Context context, String fname) {
        StringBuilder result = new StringBuilder();
        try {
            Resources res = context.getResources();
            InputStream is = res.getAssets().open(fname);
            int ch;
            byte[] buffer = new byte[1024];
            while (-1 != (ch = is.read(buffer))) {
                result.append(new String(buffer, 0, ch));
            }
        } catch (Exception e) {
            return null;
        }
        return result.toString().replaceAll("\\r\\n", "\n");
    }

    public static int createProgram(Context context) {
        String fragmentShade = ShadeUtils.loadFromAssetsFile(context, "default_fragment.glsl");
        String vertexShade = ShadeUtils.loadFromAssetsFile(context, "default_vertex.glsl");
        int ver = loadShader(GLES20.GL_VERTEX_SHADER, vertexShade);
        int fragment = loadShader(GLES20.GL_FRAGMENT_SHADER, fragmentShade);
        int program = GLES20.glCreateProgram();
        GLES20.glAttachShader(program, ver);
        GLES20.glAttachShader(program, fragment);
        GLES20.glLinkProgram(program);
        return program;
    }

    public static int createProgram(Context context, String vertexCode, String fragmentCode) {
        String fragmentShade = ShadeUtils.loadFromAssetsFile(context, fragmentCode);
        String vertexShade = ShadeUtils.loadFromAssetsFile(context, vertexCode);
        int ver = loadShader(GLES20.GL_VERTEX_SHADER, vertexShade);
        int fragment = loadShader(GLES20.GL_FRAGMENT_SHADER, fragmentShade);
        int program = GLES20.glCreateProgram();
        GLES20.glAttachShader(program, ver);
        GLES20.glAttachShader(program, fragment);
        GLES20.glLinkProgram(program);
        return program;
    }

    private static int loadShader(int type, String shaderCode) {
        //根据type创建顶点着色器或者片元着色器
        int shader = GLES20.glCreateShader(type);
        //将资源加入到着色器中，并编译
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);
        return shader;
    }
}
