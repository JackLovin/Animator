package com.sunyard.animator;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAlpha;
    Button btnRotation;
    Button btnTranslationX;
    Button btn_translationX_r;
    Button btn_translationY_top;
    Button btn_translationY_bot;
    Button btn_scaleY;
    Button btn_scaleX;
    Button playTogether;
    Button startAnimatorSet1;
    Button moveInWithrotate;
    Button moveInafterrotate;
    Button playSequentially;
    Button btn_Listener;
    Button btn_AnimatorListenerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTranslationX = findViewById(R.id.btn_translationX);
        btnAlpha = findViewById(R.id.btn_alpha);
        btnRotation = findViewById(R.id.btn_rotation);
        btn_translationX_r = findViewById(R.id.btn_translationX_r);
        btn_translationY_top = findViewById(R.id.btn_translationY_top);
        btn_translationY_bot = findViewById(R.id.btn_translationY_bot);
        moveInWithrotate = findViewById(R.id.moveInWithrotate);
        btn_scaleY = findViewById(R.id.btn_scaleY);
        btn_scaleX = findViewById(R.id.btn_scaleX);
        btn_AnimatorListenerAdapter = findViewById(R.id.btn_AnimatorListenerAdapter);
        playSequentially = findViewById(R.id.playSequentially);
        moveInafterrotate = findViewById(R.id.moveInafterrotate);
        btn_Listener = findViewById(R.id.btn_Listener);
        startAnimatorSet1 = findViewById(R.id.startAnimatorSet1);
        playTogether = findViewById(R.id.playTogether);
        btnAlpha.setOnClickListener(this);
        btn_AnimatorListenerAdapter.setOnClickListener(this);
        btnRotation.setOnClickListener(this);
        btnTranslationX.setOnClickListener(this);
        btn_translationX_r.setOnClickListener(this);
        btn_translationY_top.setOnClickListener(this);
        btn_translationY_bot.setOnClickListener(this);
        btn_scaleY.setOnClickListener(this);
        btn_scaleX.setOnClickListener(this);
        btn_Listener.setOnClickListener(this);
        playTogether.setOnClickListener(this);
        moveInWithrotate.setOnClickListener(this);
        moveInafterrotate.setOnClickListener(this);
        playSequentially.setOnClickListener(this);
        startAnimatorSet1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_alpha:
                AnimatorUtils.startObjectAnimatorAnim(btnAlpha);
                break;
            case R.id.btn_rotation:
                AnimatorUtils.startRotationAnim(btnRotation);
                break;
            case R.id.btn_translationX:
                AnimatorUtils.startTranslationXAnim(btnTranslationX);
                break;
            case R.id.btn_translationX_r:
                AnimatorUtils.startTranslationXrightAnim(btn_translationX_r);
                break;
            case R.id.btn_translationY_top:
                AnimatorUtils.startTranslationYtopAnim(btn_translationY_top);
                break;
            case R.id.btn_translationY_bot:
                AnimatorUtils.startTranslationYbotAnim(btn_translationY_bot);
                break;
            case R.id.btn_scaleY:
                AnimatorUtils.startscaleYbotAnim(btn_scaleY);
                break;
            case R.id.btn_scaleX:
                AnimatorUtils.startscaleXbotAnim(btn_scaleX);
                break;
            case R.id.moveInWithrotate:
                AnimatorSetUtils.moveInWithrotate(moveInWithrotate);
                break;
            case R.id.moveInafterrotate:
                AnimatorSetUtils.moveInafterrotate(moveInafterrotate);
                break;
            case R.id.startAnimatorSet1:
                AnimatorSetUtils.startAnimatorSet1(startAnimatorSet1);
                break;
            case R.id.playSequentially:
                AnimatorSetUtils.startplaySequentially(playSequentially);
                break;
            case R.id.playTogether:
                AnimatorSetUtils.startplayTogether(playTogether);
                break;
            case R.id.btn_Listener:
                ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(v, "rotation", 0f, 360f);
                //执行事件
                alphaAnim.setDuration(3000);
                //延迟
                alphaAnim.setStartDelay(300);
                alphaAnim.setRepeatCount(3);

                alphaAnim.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        Toast.makeText(MainActivity.this, "动画开始", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        Toast.makeText(MainActivity.this, "动画结束", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                        Toast.makeText(MainActivity.this, "动画取消", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                        Toast.makeText(MainActivity.this, "动画重复", Toast.LENGTH_SHORT).show();

                    }
                });
                alphaAnim.start();
                break;

            case R.id.btn_AnimatorListenerAdapter:
                alphaAnim = ObjectAnimator.ofFloat(v, "rotation", 0f, 360f);
                //执行事件
                alphaAnim.setDuration(3000);
                //延迟
                alphaAnim.setStartDelay(300);
                alphaAnim.setRepeatCount(0);
                alphaAnim.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {

                        Toast.makeText(MainActivity.this, "只调用动画结束", Toast.LENGTH_SHORT).show();

                    }
                });
                alphaAnim.start();

                break;
        }
    }


}