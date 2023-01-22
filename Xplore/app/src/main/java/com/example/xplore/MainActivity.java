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
        tabLayout.addTab(tabLayout.newTab().setText("BALI"));
        tabLayout.addTab(tabLayout.newTab().setText("CUSCO"));
        tabLayout.addTab(tabLayout.newTab().setText("NAPES"));
        tabLayout.addTab(tabLayout.newTab().setText("TULUM"));
        tabLayout.addTab(tabLayout.newTab().setText("BUDAPEST"));
        tabLayout.addTab(tabLayout.newTab().setText("KUALA LAMPUR"));
        tabLayout.addTab(tabLayout.newTab().setText("BARCELONA"));
        tabLayout.addTab(tabLayout.newTab().setText("BANGKOK"));
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