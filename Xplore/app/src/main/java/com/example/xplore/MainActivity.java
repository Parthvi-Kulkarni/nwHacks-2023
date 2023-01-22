package com.example.xplore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{
private TabLayout tabLayout;
private ViewPager viewPager;
private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Personal Travel Recommendations");
        setSupportActionBar(toolbar);

        tabLayout=(TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("TULUM, MEXICO"));
        tabLayout.addTab(tabLayout.newTab().setText("CUSCO, PERU"));
        tabLayout.addTab(tabLayout.newTab().setText("NAPLES, ITALY"));
        tabLayout.addTab(tabLayout.newTab().setText("BALI, INDONESIA"));
        tabLayout.addTab(tabLayout.newTab().setText("BUDAPEST, HUNGARY"));
        tabLayout.addTab(tabLayout.newTab().setText("KUALA LAMPUR, MALAYSIA"));
        tabLayout.addTab(tabLayout.newTab().setText("BARCELONA, SPAIN"));
        tabLayout.addTab(tabLayout.newTab().setText("BANGKOK, THAILAND"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        tabLayout.setOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}