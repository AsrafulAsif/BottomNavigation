package com.example.navigationbttom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class New extends AppCompatActivity {
    ChipNavigationBar chipNavigationBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
       chipNavigationBar = findViewById(R.id.bottom_nav_bar);
        chipNavigationBar.setItemSelected(R.id.nav_home,
                true);
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.fragment_container,
//                        new HomeFragment()).commit();
        bottomMenu();
    }
    private void bottomMenu() {
        chipNavigationBar.setOnItemSelectedListener
                (new ChipNavigationBar.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(int i) {
//                        Fragment fragment = null;
                        switch (i){
                            case R.id.nav_home:
                                Toast.makeText(New.this, "HI", Toast.LENGTH_SHORT).show();

                                break;
                            case R.id.nav_profile:

                                break;
                            case R.id.nav_settings:

                                break;
                        }
//                        getSupportFragmentManager().beginTransaction()
//                                .replace(R.id.fragment_container,
//                                        fragment).commit();
                    }
                });
    }
}
