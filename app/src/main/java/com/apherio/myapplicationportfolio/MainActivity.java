package com.apherio.myapplicationportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



public  void   showToast(View view){
    Toast mToast = Toast.makeText( this  , "" , Toast.LENGTH_SHORT );
    switch(view.getId()) {

        case R.id.app1:
            mToast.setText( "This button will launch streamer app!" );
            mToast.show();
           break;
        case R.id.app2:
            mToast.setText( "This button will launch scores app!" );
            mToast.show();
            break;
        case R.id.app3:
            mToast.setText( "This button will launch Library app!" );
            mToast.show();
            break;
        case R.id.app4:
            mToast.setText( "This button will launch build it bigger apps!" );
            mToast.show();
            break;
        case R.id.app5:
            mToast.setText( "This button will launch XYZ Reader !" );
            mToast.show();
            break;
        case R.id.app6:
            mToast.setText( "This button will launch Capstone App!" );
            mToast.show();
            break;

    }
    }

    }

