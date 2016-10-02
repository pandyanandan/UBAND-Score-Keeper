package com.nkp.scorekeeperapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int t1_s, t1_f, t2_s, t2_f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView t1_foul, t1_plus, t2_foul, t2_plus;
        Button b1_foul, b1_plus, b2_foul, b2_plus, reset;

        t1_f = t2_f = t2_s = t1_s = 0;
        b1_foul = (Button) findViewById(R.id.btnteama1foul);
        b2_foul = (Button) findViewById(R.id.btnteama2foul);
        b1_plus = (Button) findViewById(R.id.btnteama1);
        b2_plus = (Button) findViewById(R.id.btnteama2);
        reset = (Button) findViewById(R.id.btnreset);

        t1_foul = (TextView) findViewById(R.id.txtteam1_f);
        t2_foul = (TextView) findViewById(R.id.txtteam2_f);
        t1_plus = (TextView) findViewById(R.id.txtteam1_s);
        t2_plus = (TextView) findViewById(R.id.txtteam2_s);

        b1_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1_plus.setText(String.valueOf(++t1_s));
            }
        });
        b1_foul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1_foul.setText(String.valueOf(++t1_f));
            }
        });

        b2_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2_plus.setText(String.valueOf(++t2_s));
            }
        });
        b2_foul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2_foul.setText(String.valueOf(++t2_f));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1_f = t2_f = t2_s = t1_s = 0;
                t1_plus.setText(String.valueOf(0));
                t1_foul.setText(String.valueOf(0));
                t2_plus.setText(String.valueOf(0));
                t2_foul.setText(String.valueOf(0));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
