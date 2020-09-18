package com.sunyard.animator;

import android.animation.ObjectAnimator;
import android.view.View;

/**
 * @package name：com.sunyard.animator
 * @describe
 * @anthor jokerlover
 * @email:shengj.chen@sunyard.com
 * @time 2020/9/18 10:31 AM
 */
public class AnimatorUtils {

    /**
     * ObjectAnimator基本使用继承子ValueAnimator
     * 对对象v的alpha参数进行操作，alpha的值从1.0变到0再到1
     *
     * @param v
     */
    public static void startObjectAnimatorAnim(View v) {
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(v, "alpha", 1f, 0f, 1f);
        //执行事件
        alphaAnim.setDuration(1000);
        //延迟
        alphaAnim.setStartDelay(300);
        alphaAnim.start();
    }

    /**
     * 对对象v的rotation参数进行操作，rotation的值从0变到360,进行一次360度的旋转
     *
     * @param v
     */
    public static void startRotationAnim(View v) {
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(v, "rotation", 0f, 360f);
        //执行事件
        alphaAnim.setDuration(1000);
        //延迟
        alphaAnim.setStartDelay(300);
        alphaAnim.start();
    }


    /**
     * 对view进行左边平移操作，往左移动150 再移动回来
     *
     * @param v
     */
    public static void startTranslationXAnim(View v) {
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(v, "translationX", 0f, -150f, 0f);
        //执行事件
        alphaAnim.setDuration(1000);
        //延迟
        alphaAnim.setStartDelay(300);
        alphaAnim.start();
    }

    /**
     * 对view进行右边平移操作，往右移动150 再移动回来
     *
     * @param v
     */
    public static void startTranslationXrightAnim(View v) {
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(v, "translationX", 0f, 150f, 0f);
        //执行事件
        alphaAnim.setDuration(1000);
        InterpolatorUtils.setInterpolator(alphaAnim);
        //延迟
        alphaAnim.setStartDelay(300);
        alphaAnim.start();
    }

    /**
     * 对view进行上移操作，往上移动150 再移动回来
     *
     * @param v
     */
    public static void startTranslationYtopAnim(View v) {
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(v, "translationY", 0f, -150f, 0f);
        //执行事件
        alphaAnim.setDuration(1000);
        //延迟
        alphaAnim.setStartDelay(300);
        alphaAnim.start();
    }
  /**
     * 对view进行下边平移操作，往下移动150 再移动回来
     *
     * @param v
     */
    public static void startTranslationYbotAnim(View v) {
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(v, "translationY", 0f, 150f, 0f);
        //执行事件
        alphaAnim.setDuration(1000);
        //延迟
        alphaAnim.setStartDelay(300);
        alphaAnim.start();
    }
    /**
     * 对view进行垂直缩放操作， 放大三倍再还原
     *
     * @param v
     */
    public static void startscaleYbotAnim(View v) {
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(v, "scaleY", 1f, 3f, 1f);
        //执行事件
        alphaAnim.setDuration(1000);
        //延迟
        alphaAnim.setStartDelay(300);
        alphaAnim.start();
    }

    /**
     * 对view进行水平缩放操作， 放大三倍再还原
     *
     * @param v
     */
    public static void startscaleXbotAnim(View v) {
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(v, "scaleX", 1f, 3f, 1f);
        //执行事件
        alphaAnim.setDuration(1000);
        //延迟
        alphaAnim.setStartDelay(300);
        alphaAnim.start();
    }

}
