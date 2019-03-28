package com.jw.mynbaapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.jw.mynbaapplication.R;

public class TeamDetailActivity extends AppCompatActivity {
    TextView Location;
    TextView Teamname;
    Toolbar mActionBarToolbar;
    ImageView imageView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teamdetail);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = (ImageView) findViewById(R.id.team_image_header);
        Teamname = (TextView) findViewById(R.id.header);

        Location = (TextView) findViewById(R.id.location);

        String teamname = getIntent().getExtras().getString("name");
        String logo = getIntent().getExtras().getString("logo");
        String location = getIntent().getExtras().getString("location");

        Location.setText(location);
        Linkify.addLinks(Location, Linkify.WEB_URLS);

        Teamname.setText(teamname);
        Glide.with(this)
                .load(logo)
                .placeholder(R.drawable.load)
                .into(imageView);

//        getSupportActionBar().setTitle("Team Details Activity");

    }

    private Intent createShareForcastIntent(){
        String teamname = getIntent().getExtras().getString("name");
        String location = getIntent().getExtras().getString("location");
        Intent shareIntent = ShareCompat.IntentBuilder.from(this)
                .setType("text/plain")
                    .setText(" Check This Team @ "+ teamname + " based in" +location)
                    .getIntent();
        return shareIntent;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.teamdetail, menu);
        MenuItem menuItem = menu.findItem(R.id.action_share);
        menuItem.setIntent(createShareForcastIntent());
        return true;

    }
}
