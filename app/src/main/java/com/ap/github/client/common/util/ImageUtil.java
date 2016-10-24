package com.ap.github.client.common.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * image util
 * Created by SunHZ on 10/21/16.
 */
public final class ImageUtil {

    private ImageUtil() {
        // no instance
    }

    /**
     * load image no other params
     *
     * @param context   context
     * @param source    image source
     * @param imageView into ImageView
     */
    public static void loadImage(Context context, Object source, ImageView imageView) {
        Glide.with(context).load(source).into(imageView);
    }

    /**
     * load image no other params
     *
     * @param context     context
     * @param source      image source
     * @param imageView   into ImageView
     * @param placeholder placeholder resource
     */
    public static void loadImage(Context context, Object source, ImageView imageView, @DrawableRes int placeholder) {
        Glide.with(context).load(source).placeholder(placeholder).into(imageView);
    }

    /**
     * load image no other params
     *
     * @param context     context
     * @param source      image source
     * @param imageView   into ImageView
     * @param placeholder placeholder drawable
     */
    public static void loadImage(Context context, Object source, ImageView imageView, Drawable placeholder) {
        Glide.with(context).load(source).placeholder(placeholder).into(imageView);
    }
}
