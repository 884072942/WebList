package com.example.weblist;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class FabActivity extends AppCompatActivity {
    private ZImage[]images={new ZImage("微信二维码",R.drawable.ic_wx),
            new ZImage("支付宝二维码",R.drawable.ic_zfb)};

    private List<ZImage> zImageList = new ArrayList<>();

    private ImageAdapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fab_layout);
        Toolbar toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar !=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        initImages();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        imageAdapter = new ImageAdapter(zImageList);
        recyclerView.setAdapter(imageAdapter);
    }
    private void initImages(){
            ZImage wx = new ZImage("各位大佬，您的赏赐就是我的动力",R.drawable.ic_wx);
            zImageList.add(wx);
            ZImage zfb = new ZImage("大佬们，赏几块大洋吧/(ㄒoㄒ)/~~",R.drawable.ic_zfb);
            zImageList.add(zfb);

    }
}
