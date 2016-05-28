package com.probarnocuestanada.crossfitchess.chesslab02;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String TAG = MainActivity.class.getName();

    ImageView image;

    int idx = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


        image = (ImageView) findViewById(R.id.chess_board_image);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




    public void firstMateEn2(View view) {

        Log.d(TAG, "firstMateEn2" +  idx);

        idx = 0;

        navigateMateEn2(view);
    }

    public void lastMateEn2(View view) {

        Log.d(TAG, "lastMateEn2" +  idx);

        idx = 11;

        navigateMateEn2(view);
    }

    public void prevMateEn2(View view) {

        Log.d(TAG, "prevMateEn2" +  idx);

        idx --;

        navigateMateEn2(view);
    }

    public void nextMateEn2(View view) {

        Log.d(TAG, "nextMateEn2" +  idx);

        idx ++;

        navigateMateEn2(view);
    }

    private void navigateMateEn2(View view) {

        Log.d(TAG, "NETX - navigateMateEn2 " +  idx);

        if (idx < 0) {
            idx = 0;
        }

        if (idx > 11) {
            idx = 0;
        }

        if (idx == 0) {
            image.setImageResource(R.drawable.chess_mate2_00000);
        }

        if (idx == 1) {
            image.setImageResource(R.drawable.chess_mate2_00001);
        }

        if (idx == 2) {
            image.setImageResource(R.drawable.chess_mate2_00002);
        }

        if (idx == 3) {
            image.setImageResource(R.drawable.chess_mate2_00003);
        }

        if (idx == 4) {
            image.setImageResource(R.drawable.chess_mate2_00004);
        }

        if (idx == 5) {
            image.setImageResource(R.drawable.chess_mate2_00005);
        }

        if (idx == 6) {
            image.setImageResource(R.drawable.chess_mate2_00006);
        }

        if (idx == 7) {
            image.setImageResource(R.drawable.chess_mate2_00007);
        }

        if (idx == 8) {
            image.setImageResource(R.drawable.chess_mate2_00008);
        }

        if (idx == 9) {
            image.setImageResource(R.drawable.chess_mate2_00009);
        }

        if (idx == 10) {
            image.setImageResource(R.drawable.chess_mate2_00010);
        }

        if (idx == 11) {
            image.setImageResource(R.drawable.chess_mate2_00011);
        }

        // Toast.makeText(this, "Boton Click", Toast.LENGTH_SHORT);


    }

    public void nextMateEn1(View view) {
        Log.d(TAG, "NETX - nextMateEn1 ");
        Toast.makeText(this, "Boton Click nextMateEn1", Toast.LENGTH_SHORT);
    }

    public void nextMateEn3(View view) {
        Log.d(TAG, "NETX - nextMateEn3 ");
        Toast.makeText(this, "Boton Click nextMateEn3", Toast.LENGTH_SHORT);
    }

    public void nextMateEn4(View view) {
        Log.d(TAG, "NETX - nextMateEn4 ");
        Toast.makeText(this, "Boton Click nextMateEn4", Toast.LENGTH_SHORT);
    }


}
