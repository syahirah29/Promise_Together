package com.myfirstapp.logintest2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by LittleBird on 2018-04-15.
 */

public class SplashActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        //startActivity(new Intent(this, ScreenSlidePagerActivity.class));
        //startActivity(new Intent(this, SignIn.class));
        //startActivity(new Intent(this, LoginRegister.class));
        startActivity(new Intent(this, Tutorial1.class));
        finish();
    }
}
