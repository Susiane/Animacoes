package com.laboratory.android.animacoes;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.img_ic_launcher);
        ImageView imageView2 = (ImageView) findViewById(R.id.img_ic_launcher2);

        AlphaAnimation alphaAnimation = new AlphaAnimation(1f, 0f);
        alphaAnimation.setDuration(5000);
        imageView.startAnimation(alphaAnimation);

        final ObjectAnimator anim = ObjectAnimator.ofFloat(imageView2, "alpha", 1f, 0f, 1f);
        anim.setDuration(5000);
        anim.start();


    }
}
