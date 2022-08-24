package com.example.navigationbttom;

import static androidx.appcompat.app.AppCompatDelegate.setDefaultNightMode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            getWindow().setNavigationBarColor(getResources().getColor(R.color.bg));
        //Universal codes for white
        setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
        getWindow().setStatusBarColor(this.getResources().getColor(R.color.bg));
        //end


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
       bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               switch (item.getItemId()){
                   case R.id.nav_profile:
                       startActivity(new Intent(getApplicationContext(),Profile.class));
                       overridePendingTransition(R.anim.zoom_enter,R.anim.zoom_exit);
                       return true;
                   case R.id.nav_home:
                       return true;
                   case R.id.nav_settings:
                       startActivity(new Intent(getApplicationContext(),Settings.class));
                       overridePendingTransition(R.anim.zoom_enter,R.anim.zoom_exit);
                       return true;
               }

               return false;
           }
       });
    }
}