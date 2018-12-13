package com.blessingsoftware.myweatherreborn;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather", null) != null) {
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
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

/*package com.blessingsoftware.myweatherreborn;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences prefs=PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.getString("weather",null)!=null){
            Intent intent=new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}*/