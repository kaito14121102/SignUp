package com.anime.rezero.signup;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Login extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Toolbar toolbarManHinhChinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        toolbarManHinhChinh = (Toolbar) findViewById(R.id.toolbar_manhinhchinh);
        ActionBar();
    }

    private void ActionBar() {
        setSupportActionBar(toolbarManHinhChinh);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarManHinhChinh.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
