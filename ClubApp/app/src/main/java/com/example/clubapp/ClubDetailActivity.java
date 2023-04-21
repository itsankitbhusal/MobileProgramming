package com.example.clubapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClubDetailActivity extends AppCompatActivity {

    TextView tvClubname,tvClubaddress,tvClubtype,tvClubTonightEvent;
    ImageView ivClubimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_detail);

        String clubname = getIntent().getStringExtra("CLUBNAME");
        String clubtype = getIntent().getStringExtra("CLUBTYPE");
        String clubaddress = getIntent().getStringExtra("CLUBADDRESS");
        String clubtonightEvent=getIntent().getStringExtra("CLUBTONIGHTEVENT");
        int clubimagesrc=getIntent().getIntExtra("CLUBIMAGE",0);



        tvClubname = findViewById(R.id.tvClubname);
        tvClubtype = findViewById(R.id.tvClubtype);
        tvClubaddress = findViewById(R.id.tvAddress);
        tvClubTonightEvent=findViewById(R.id.tvTonightEvents);
        ivClubimage = findViewById(R.id.ivImage);

        tvClubname.setText(clubname);
        tvClubaddress.setText("Address : "+clubaddress);
        tvClubtype.setText(clubtype);
        tvClubTonightEvent.setText("Tonight Events : "+clubtonightEvent);

        ivClubimage.setImageResource(clubimagesrc);

    }
}