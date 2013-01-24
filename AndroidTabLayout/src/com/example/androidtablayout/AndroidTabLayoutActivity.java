package com.example.androidtablayout;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AndroidTabLayoutActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TabHost tabHost = getTabHost();
        
        // Tab for Photos
        TabSpec photospec = tabHost.newTabSpec("Photos");
        photospec.setIndicator("Photos", getResources().getDrawable(R.drawable.icon_photos_tab));
        Intent photosIntent = new Intent(this, PhotosActivity.class);
        photospec.setContent(photosIntent);
        
        // Tab for Songs
        TabSpec newsspec = tabHost.newTabSpec("News");
        // setting Title and Icon for the Tab
        newsspec.setIndicator("News", getResources().getDrawable(R.drawable.icon_songs_tab));
        Intent songsIntent = new Intent(this, News.class);
        newsspec.setContent(songsIntent);
        
        // Tab for Videos
        TabSpec aboutspec = tabHost.newTabSpec("About");
        aboutspec.setIndicator("About", getResources().getDrawable(R.drawable.icon_videos_tab));
        Intent videosIntent = new Intent(this, About.class);
        aboutspec.setContent(videosIntent);
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(photospec); // Adding photos tab
        tabHost.addTab(newsspec); // Adding songs tab
        tabHost.addTab(aboutspec); // Adding videos tab
    }
}