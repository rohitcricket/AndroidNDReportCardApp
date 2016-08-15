package com.example.android.reportcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create an ArrayList of ReportCard objects

        ArrayList<ReportCard> reportCards = new ArrayList<ReportCard>();

        reportCards.add(new ReportCard("Mr.Spock", "A+", R.drawable.spock));
        reportCards.add(new ReportCard("7 of 9", "A+", R.drawable.seven));


        // Create an {@link ReportCardAdapter}, whose data source is a list of
        // {@link ReportCard}s. The adapter knows how to create list item views for each item
        // in the list.
        ReportCardAdapter flavorAdapter = new ReportCardAdapter(this, reportCards);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(flavorAdapter);


    }

}
