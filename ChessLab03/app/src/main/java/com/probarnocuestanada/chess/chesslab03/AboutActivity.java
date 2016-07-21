package com.probarnocuestanada.chess.chesslab03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Pablo Ezequiel on 20/6/16.
 * <p/>
 * ProbarNoCuestaNada.com
 * <p/>
 * https://github.com/PabloEzequiel
 * https://javaen.blogspot.com
 */
public class AboutActivity extends AppCompatActivity {

    public static String TAG = AboutActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "AboutActivity :: Creado");

        setContentView(R.layout.gchess_b001_about);



    }


}
