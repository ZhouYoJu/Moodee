package com.tscs.yoj.moodee;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import Consts.LoginConsts;

public class ModActivityMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mod_activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Intent intent = getIntent();
        //String[] info_ParamName = intent.getStringArrayExtra(LoginConsts.S_Info_ParamName);

        String info_ParamName_Screen_Name =intent.getStringExtra(LoginConsts.S_Info_ParamName_Screen_Name);
        TextView wb_screen_name = (TextView)findViewById(R.id.wb_screen_name);
        wb_screen_name.setText(info_ParamName_Screen_Name);


    }

}
