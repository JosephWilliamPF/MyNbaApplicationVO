package com.jw.mynbaapplication.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.jw.mynbaapplication.R;

public class TeamDetailActivity extends AppCompatActivity {
    TextView Location;
    TextView Teamname;
    TextView Arena;
    TextView SimpleName;
    ImageView imageView;

    @SuppressLint("SetTextI18n")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teamdetail);

        imageView = (ImageView) findViewById(R.id.team_image_header);
        Teamname = (TextView) findViewById(R.id.header);
        Location = (TextView) findViewById(R.id.location);
        Arena = (TextView) findViewById(R.id.arena);
        SimpleName = (TextView) findViewById(R.id.sName);

        String teamname = getIntent().getExtras().getString("name");
        String logo = getIntent().getExtras().getString("logo");
        String location = getIntent().getExtras().getString("location");
        String arena = getIntent().getExtras().getString("arena");
        String simpleName = getIntent().getExtras().getString("simpleName");

        Teamname.setText(teamname);
        SimpleName.setText(simpleName);

        Location.setText(" " +location);
        Arena.setText(" " + arena);

        Linkify.addLinks(Location, Linkify.WEB_URLS);
        Linkify.addLinks(Arena, Linkify.WEB_URLS);

        Glide.with(this)
                .load(logo)
                .placeholder(R.drawable.load)
                .into(imageView);
    }


    public void redirectToHome(View v){
        final Intent intent = new Intent(this, MainActivity.class);

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        });
    }



}
