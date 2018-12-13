package com.blessingsoftware.myweatherreborn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

/*public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=(ImageView)findViewById(R.id.image);
        imageView.setImageResource(R.drawable.bless);
        AlphaAnimation animation=new AlphaAnimation(0,1);
        animation.setDuration(3000);
        imageView.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                AlphaAnimation alphaAnimation=new AlphaAnimation(1,0);
                alphaAnimation.setDuration(1500);
                imageView.startAnimation(animation);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                        MainActivity.this.finish();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
/*开始尝试
        imageView=(ImageView)findViewById(R.id.image);
                imageView.setImageResource(R.drawable.bless);
                AlphaAnimation animation=new AlphaAnimation(0,1);
                animation.setDuration(3000);
                imageView.startAnimation(animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
@Override
public void onAnimationStart(Animation animation) {

        }

@Override
public void onAnimationEnd(Animation animation) {
        AlphaAnimation alphaAnimation=new AlphaAnimation(1,0);
        alphaAnimation.setDuration(1500);
        imageView.startAnimation(animation);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
@Override
public void onAnimationStart(Animation animation) {

        }

@Override
public void onAnimationEnd(Animation animation) {
        Intent intent=new Intent(MainActivity.this,);
        startActivity(intent);
        MainActivity.this.finish();
        }

@Override
public void onAnimationRepeat(Animation animation) {

        }
        });
        }

@Override
public void onAnimationRepeat(Animation animation) {

        }
        });
*/
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.image);
        imageView.setImageResource(R.drawable.bless);
        AlphaAnimation first = new AlphaAnimation(0, 1);
        first.setDuration(4000);
        imageView.startAnimation(first);
        first.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                AlphaAnimation second = new AlphaAnimation(1, 0);
                second.setDuration(2000);
                imageView.startAnimation(second);
                second.setFillAfter(true);
                second.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                        MainActivity.this.finish();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

        });
    }
}