package com.sunyard.animator;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * @package name：com.sunyard.animator
 * @describe
 * @anthor jokerlover
 * @email:shengj.chen@sunyard.com
 * @time 2020/9/18 10:52 AM
 */
public class AnimatorSetUtils {

    /**
     * 实现组合动画功能主要需要借助AnimatorSet这个类，这个类提供了一个play()方法，
     * 如果我们向这个方法中传入一个Animator对象(ValueAnimator或ObjectAnimator)将会返回一个AnimatorSet.Builder的实例，
     * AnimatorSet.Builder中包括以下四个方法：
     * after(Animator anim)   将现有动画插入到传入的动画之后执行
     * after(long delay)   将现有动画延迟指定毫秒后执行
     * before(Animator anim)   将现有动画插入到传入的动画之前执行
     * with(Animator anim)   将现有动画和传入的动画同时执行
     */

//平移和旋转一起
    public static void moveInWithrotate(View view) {
        float curTranslationX = view.getTranslationX();
        ObjectAnimator moveIn = ObjectAnimator.ofFloat(view, "translationX", curTranslationX, 500f, curTranslationX);
        ObjectAnimator rotate = ObjectAnimator.ofFloat(view, "rotation", 0f, 360f);
        AnimatorSet animSet = new AnimatorSet();
        animSet.play(rotate).with(moveIn);
        animSet.setDuration(5000);
        animSet.start();
    }

    //平移和旋转一起
    public static void moveInafterrotate(View view) {
        float curTranslationX = view.getTranslationX();
        ObjectAnimator moveIn = ObjectAnimator.ofFloat(view, "translationX", curTranslationX, 500f);
        ObjectAnimator rotate = ObjectAnimator.ofFloat(view, "rotation", 0f, 360f);
        AnimatorSet animSet = new AnimatorSet();
        animSet.play(rotate).after(moveIn);
        animSet.setDuration(5000);
        animSet.start();
    }

    public static void startAnimatorSet1(View view) {
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(view, "translationX", 0f, 100f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(view, "rotation", 0f, 360f);

        ObjectAnimator animator3 = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(5000);
        //动画1，2同时执行
        animatorSet.play(animator1).with(animator2);
        //动画2执行完成后执行动画3
        animatorSet.play(animator3).after(animator2);
        animatorSet.start();
    }
    public static void startplaySequentially(View view) {
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(view, "translationX", 0f, 100f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(view, "rotation", 0f, 360f);

        ObjectAnimator animator3 = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(5000);
        animatorSet.playSequentially(animator1,animator2,animator3);
        animatorSet.start();
    } public static void startplayTogether(View view) {
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(view, "translationX", 0f, 100f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(view, "rotation", 0f, 360f);

        ObjectAnimator animator3 = ObjectAnimator.ofFloat(view, "scaleX", 0f, 1f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(5000);
        animatorSet.playTogether(animator1,animator2,animator3);
        animatorSet.start();
    }

    /**animatorSet.playSequentially(animator1,animator2,animator3)动画1,2,3按顺序执行
     animatorSet.playTogether(animator1,animator2,animator3)三个动画同时执行
     */
}
