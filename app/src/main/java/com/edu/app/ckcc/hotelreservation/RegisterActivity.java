package com.edu.app.ckcc.hotelreservation;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by se7en on 4/16/18.
 */

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        //TextView txtCreatAcc = findViewById(R.id.txt_creatacc);
        //txtCreatAcc.setOnClickListener(this);

        ImageView imgBack = findViewById(R.id.btt_back);
        imgBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        onBackPressed();
    }
}
