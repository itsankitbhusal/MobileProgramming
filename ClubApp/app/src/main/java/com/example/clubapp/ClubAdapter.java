package com.example.clubapp;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class ClubAdapter extends ArrayAdapter<String> {
    Context context;
    String[] clubname;
    String[] clubaddress;
    String[] clubtype;

    int[] clubimage;


    ClubAdapter(Context context,String[] clubname,String[] clubtype,String[] clubaddress,int[] clubimage){
        super(context,R.layout.club_items,clubname);
        this.context=context;
        this.clubname=clubname;
        this.clubaddress=clubaddress;
        this.clubtype=clubtype;
        this.clubimage=clubimage;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);

        View v=((Activity)context).getLayoutInflater().inflate(R.layout.club_items,null,false);
        TextView tvClubname=v.findViewById( R.id.tvClubname);
        TextView tvClubaddress=v.findViewById(R.id.tvClubaddress);
        TextView tvClubtype=v.findViewById(R.id.tvClubtype);
        ImageView ivClubimage=v.findViewById(R.id.ivClubimg);

       tvClubname.setText(clubname[position]);
       tvClubaddress.setText(clubaddress[position]);
       tvClubtype.setText(clubtype[position]);
       ivClubimage.setImageResource(clubimage[position]);





        return v;
    }



}


