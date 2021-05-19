package com.example.nagavitionapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.widget.Toolbar;



import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
               private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById (R.id.toolbar);
        setSupportActionBar (toolbar);


        drawerLayout = findViewById (R.id.drawer_layout);


        NavigationView navigationView = findViewById (R.id.nav_view);
        navigationView.setNavigationItemSelectedListener (this);
       // ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
              //  R.string.navigation_drawer_open,R.string.navigation_drawer_open  );
  //drawerLayout.addDrawerListener (toggle);
  //toggle.syncState ();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()) {
            case R.id.nav_message:

               // getSupportFragmentManager ().beginTransaction ().replace (R.id.fragment_container, ));


                break;



        }
        return true;
    }

    public void MessageFragment(){}



    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen (GravityCompat.START)){
            drawerLayout.closeDrawer (GravityCompat.START);
        }else{
            super.onBackPressed ( );
        }

    }

    private void setSupportActionBar(Toolbar toolbar) {

    }
}