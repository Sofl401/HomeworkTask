package com.example.homeworktask1;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ImageView location1;
    private ImageView location2;
    private ImageView location3;
    private ImageView location4;
    private ImageView location5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout clock1 = findViewById(R.id.clock1);
        final ConstraintLayout clock2 = findViewById(R.id.clock2);
        final ConstraintLayout clock3 = findViewById(R.id.clock3);
        final ConstraintLayout clock4 = findViewById(R.id.clock4);
        final ConstraintLayout clock5 = findViewById(R.id.clock5);

        TextView header1 = clock1.findViewById(R.id.header);
        TextView header2 = clock2.findViewById(R.id.header);
        TextView header3 = clock3.findViewById(R.id.header);
        TextView header4 = clock4.findViewById(R.id.header);
        TextView header5 = clock5.findViewById(R.id.header);

        TextView country1 = clock1.findViewById(R.id.country);
        TextView country2 = clock2.findViewById(R.id.country);
        TextView country3 = clock3.findViewById(R.id.country);
        TextView country4 = clock4.findViewById(R.id.country);
        TextView country5 = clock5.findViewById(R.id.country);

        Button hide1 = clock1.findViewById(R.id.hide);
        Button hide2 = clock2.findViewById(R.id.hide);
        Button hide3 = clock3.findViewById(R.id.hide);
        Button hide4 = clock4.findViewById(R.id.hide);
        Button hide5 = clock5.findViewById(R.id.hide);

        final TextClock sydney = clock1.findViewById(R.id.textClock);
        final TextClock newYork = clock5.findViewById(R.id.textClock);
        final TextClock beijing = clock4.findViewById(R.id.textClock);
        final TextClock egypt = clock3.findViewById(R.id.textClock);
        final TextClock paris = clock2.findViewById(R.id.textClock);

        header1.setText("Sydney");
        country1.setText("Australia");
        location1 = clock1.findViewById(R.id.location);
        location1.setImageResource(R.drawable.discover_sydney_opera_house);

        header2.setText("Paris");
        country2.setText("France");
        location2 = clock2.findViewById(R.id.location);
        location2.setImageResource(R.drawable.paris);
        paris.setTimeZone("Europe/Paris");

        header3.setText("Ciaro");
        country3.setText("Egypt");
        location3 = clock3.findViewById(R.id.location);
        location3.setImageResource(R.drawable.pyramid);
        egypt.setTimeZone("Egypt");

        header4.setText("Beijing");
        country4.setText("China");
        location4 = clock4.findViewById(R.id.location);
        location4.setImageResource(R.drawable.wall_of_china);
        beijing.setTimeZone("Asia/Shanghai");

        header5.setText("New York");
        country5.setText("America");
        location5 = clock5.findViewById(R.id.location);
        location5.setImageResource(R.drawable.statue);
        newYork.setTimeZone("America/New_York");

        hide1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                clock1.setVisibility(View.GONE);
            }
        });

        hide2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                clock2.setVisibility(View.GONE);
            }
        });

        hide3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                clock3.setVisibility(View.GONE);
            }
        });

        hide4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                clock4.setVisibility(View.GONE);
            }
        });

        hide5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                clock5.setVisibility(View.GONE);
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_12h:
                        sydney.setFormat12Hour("h:mm a");
                        paris.setFormat12Hour("h:mm a");
                        beijing.setFormat12Hour("h:mm a");
                        egypt.setFormat12Hour("h:mm a");
                        newYork.setFormat12Hour("h:mm a");
                        break;
                    case R.id.action_24h:
                        sydney.setFormat12Hour("kk:mm");
                        paris.setFormat12Hour("kk:mm");
                        beijing.setFormat12Hour("kk:mm");
                        egypt.setFormat12Hour("kk:mm");
                        newYork.setFormat12Hour("kk:mm");
                        break;
                    case R.id.ShowAll:
                        clock1.setVisibility(View.VISIBLE);
                        clock2.setVisibility(View.VISIBLE);
                        clock3.setVisibility(View.VISIBLE);
                        clock4.setVisibility(View.VISIBLE);
                        clock5.setVisibility(View.VISIBLE);
                }
                return true;
            }
        });
    }
}
