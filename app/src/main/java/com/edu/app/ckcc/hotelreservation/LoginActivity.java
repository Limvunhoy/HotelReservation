package com.edu.app.ckcc.hotelreservation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by se7en on 4/7/18.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        TextView txtNotNow = findViewById(R.id.txt_notnow);
        txtNotNow.setOnClickListener(this);
//        //TextView txtNotNow = findViewById(R.id.txt_notnow);
//        //txtNotNow.setOnClickListener(this);
//
        TextView txtCreateAcc = findViewById(R.id.txt_createacc);
        txtCreateAcc.setOnClickListener(this);
//        //TextView txtCreatAcc = findViewById(R.id.txt_createacc);
//        //txtCreatAcc.setOnClickListener(this);
//
//        //ImageView imgBack = findViewById(R.id.btt_back);
//        //imgBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
    switch (view.getId()) {

        case R.id.txt_notnow :
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            break;

        case R.id.txt_createacc :
            Intent intent1 = new Intent(this, RegisterActivity.class);
            startActivity(intent1);
            break;

        //case R.id.btt_back :
            //onBackPressed();
            //break;

    }
    }

}
