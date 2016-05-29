package com.probarnocuestanada.crossfitchess.chesslab02;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String TAG = MainActivity.class.getName();


    private static int MAX_MateEn1 = 13;
    private static int MAX_MateEn2 = 11;
    private static int MAX_MateEn3 = 15;
    private static int MAX_MateEn4 = 12;

    ImageView image;

    TextView chessSolution;
    int idx = 0;

    private SeekBar seekBar;
    private TextView  textView;


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

        image     = (ImageView) findViewById(R.id.chess_board_image);

        seekBar   = (SeekBar)   findViewById(R.id.seekBar1);
        textView  = (TextView)  findViewById(R.id.seekBar1_text);


        // Initialize the textview with '0'.
        textView.setText("Ejercicio: " + seekBar.getProgress() + "/" + seekBar.getMax());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = idx;


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Toast.makeText(getApplicationContext(), "Started tracking SeekBar", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;

                // Cambio el problema mientras se desliza la SeekBar
                textView.setText("Ejercicio: " + progress + "/" + seekBar.getMax());
                idx = progresValue;
                navigateMateEn2();
            }


            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                // Cambio el problema cuando se suelta la seekBar
                textView.setText("Ejercicio: " + progress + "/" + seekBar.getMax());
                idx = progress;
                navigateMateEn2();
            }
        });


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


    public void showSolution(View view) {
        Log.d(TAG, "showSolution" +  idx);

        chessSolution.setText("1.♕g7+ ♞xg7 2. ♘h6# ");
    }


    public void firstMateEn2(View view) {

        Log.d(TAG, "firstMateEn2" +  idx);

        idx = 0;

        navigateMateEn2();
    }

    public void lastMateEn2(View view) {

        Log.d(TAG, "lastMateEn2" +  idx);

        idx = MAX_MateEn2;

        navigateMateEn2();
    }

    public void prevMateEn2(View view) {

        Log.d(TAG, "prevMateEn2" +  idx);

        idx --;

        navigateMateEn2();
    }

    public void nextMateEn2(View view) {

        Log.d(TAG, "nextMateEn2" +  idx);

        idx ++;

        navigateMateEn2();
    }

    private void navigateMateEn2() {

        Log.d(TAG, "NETX - navigateMateEn2 " +  idx);

        if (idx < 0) {
            idx = 0;
        }

        if (idx > MAX_MateEn2) {
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
