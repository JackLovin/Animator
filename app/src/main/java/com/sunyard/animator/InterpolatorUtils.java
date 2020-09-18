package com.sunyard.animator;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/**
 * @package name：com.sunyard.animator
 * @describe
 * @anthor jokerlover
 * @email:shengj.chen@sunyard.com
 * @time 2020/9/18 11:14 AM
 */
public class InterpolatorUtils {

    /**
     * //加速查值器，参数越大，速度越来越快
     * animator.setInterpolator(new AccelerateInterpolator(10));
     * //减速差值起，和上面相反
     * animator.setInterpolator(new DecelerateInterpolator(10));
     * //先加速后减速插值器
     * animator.setInterpolator(new AccelerateDecelerateInterpolator());
     * //张力值，默认为2，T越大，初始的偏移越大，而且速度越快
     * animator.setInterpolator(new AnticipateInterpolator(3));
     * //张力值tension，默认为2，张力越大，起始时和结束时的偏移越大
     * animator.setInterpolator(new AnticipateOvershootInterpolator(6));
     * //弹跳插值器
     * animator.setInterpolator(new BounceInterpolator());
     * //周期插值器
     * animator.setInterpolator(new CycleInterpolator(2));
     * //线性差值器,匀速
     * animator.setInterpolator(new LinearInterpolator());
     */


    public static void setInterpolator(ValueAnimator animator) {
        //加速查值器，参数越大，速度越来越快
        animator.setInterpolator(new AccelerateInterpolator(10));
//        //减速差值起，和上面相反
//        animator.setInterpolator(new DecelerateInterpolator(10));
//        //先加速后减速插值器
//        animator.setInterpolator(new AccelerateDecelerateInterpolator());
//        //张力值，默认为2，T越大，初始的偏移越大，而且速度越快
//        animator.setInterpolator(new AnticipateInterpolator(3));
//        //张力值tension，默认为2，张力越大，起始时和结束时的偏移越大
//        animator.setInterpolator(new AnticipateOvershootInterpolator(6));
//        //弹跳插值器
//        animator.setInterpolator(new BounceInterpolator());
//        //周期插值器
//        animator.setInterpolator(new CycleInterpolator(2));
//        //线性差值器,匀速
//        animator.setInterpolator(new LinearInterpolator());

    }
}
