package com.example.weblist;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navView = findViewById(R.id.nav_view);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.No_1:
                        Intent intent1 = new Intent(MainActivity.this,No_1Activity.class);
                        startActivity(intent1);
                        break;
                    case R.id.No_2:
                        Intent intent2 = new Intent(MainActivity.this,No_2Activity.class);
                        startActivity(intent2);
                        break;
                    case R.id.No_3:
                        Intent intent3 = new Intent(MainActivity.this,No_3Activity.class);
                        startActivity(intent3);
                        break;
                    case R.id.No_4:
                        Intent intent4 = new Intent(MainActivity.this,No_4Activity.class);
                        startActivity(intent4);
                        break;
                    case R.id.No_5:
                        Intent intent5 = new Intent(MainActivity.this,No_5Activity.class);
                        startActivity(intent5);
                        break;
                    case R.id.No_6:
                        Intent intent6 = new Intent(MainActivity.this,No_6Activity.class);
                        startActivity(intent6);
                        break;
                        default:
                }
                return true;
            }
        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FabActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting:
                Intent intent = new Intent(MainActivity.this,SettingsActivity.class);
                startActivity(intent);
                break;
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
                default:
        }
        return true;
    }
}
