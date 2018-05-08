package com.edu.app.ckcc.hotelreservation;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_drawer_activity);


        Toolbar toolbar=findViewById(R.id.test_tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Hotel Reservation");

        drawerLayout=findViewById(R.id.test_navigation);
        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        NavigationView navigationView=findViewById(R.id.navigaton_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                 if (item.getItemId() == R.id.mnu_booking) {
                     onHomeClick();
                } else if (item.getItemId() == R.id.mnu_payment) {
                    Toast.makeText(MainActivity.this, "User Clicks Payment Option", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.mnu_event) {
                    //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                    onEventClick();
                } else if (item.getItemId() == R.id.mnu_ivite) {
                    Toast.makeText(MainActivity.this, "User Clicks Invite Friends", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId()== R.id.mnu_contact) {
                    Toast.makeText(MainActivity.this, "User Clicks Contact Us", Toast.LENGTH_SHORT).show();
                } else
                     Toast.makeText(MainActivity.this, "User Clicks Chat with us", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }
    private void onEventClick(){
        drawerLayout.closeDrawers();
        FragmentActivity fragmentActivity=new FragmentActivity();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lyt_fragment_view,fragmentActivity);
        fragmentTransaction.commit();

    }

    private void onHomeClick(){
        drawerLayout.closeDrawers();
        FragmentHome fragmentHome = new FragmentHome();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lyt_fragment_view,fragmentHome);
        fragmentTransaction.commit();
    }
}