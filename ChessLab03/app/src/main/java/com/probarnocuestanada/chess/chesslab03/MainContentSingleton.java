package com.probarnocuestanada.chess.chesslab03;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Pablo Ezequiel on 7/6/16.
 * <p>
 * ProbarNoCuestaNada.com
 * <p>
 * https://github.com/PabloEzequiel
 * https://javaen.blogspot.com
 */
public class MainContentSingleton {

    public static String TAG = MainContentSingleton.class.getName();



    public static String KEY_MATE_1_COLLECTION = "KEY_MATE_1_COLLECTION";
    public static String KEY_MATE_2_COLLECTION = "KEY_MATE_2_COLLECTION";
    public static String KEY_MATE_3_COLLECTION = "KEY_MATE_3_COLLECTION";
    public static String KEY_MATE_4_COLLECTION = "KEY_MATE_4_COLLECTION";

    private static String MATE_COLLECTION = KEY_MATE_3_COLLECTION;
    private static int idx = 0;

    private static int MAX_MateEn1 = 7;
    private static int MAX_MateEn2 = 10;
    private static int MAX_MateEn3 = 15;
    private static int MAX_MateEn4 = 1;


    private MainContent mainContent;

    /*
    * Los obetos del MainContent
    * */
     class MainContent {


        private  SeekBar seekBar;
        private  TextView textView;
        private  ImageView image;
        private  TextView chessSolution;

        private  AppCompatActivity activity;

        public MainContent(AppCompatActivity activity) {
            this.activity = activity;

            seekBar        = (SeekBar) activity.findViewById(R.id.seekBar1);
            textView       = (TextView) activity.findViewById(R.id.seekBar1_text);
            image          = (ImageView) activity.findViewById(R.id.chess_board_image);
            chessSolution  = (TextView) activity.findViewById(R.id.chess_solution);
        }


        public AppCompatActivity getActivity() {
            return activity;
        }

        public void setActivity(AppCompatActivity activity) {
            this.activity = activity;
        }

        public SeekBar getSeekBar() {
            return seekBar;
        }

        public TextView getTextView() {
            return textView;
        }

        public ImageView getImage() {
            return image;
        }

        public TextView getChessSolution() {
            return chessSolution;
        }

    }



    // Singleton
    private static MainContentSingleton instance;

    private MainContentSingleton() {}

    public static MainContentSingleton getInstance() {

        if(instance == null) {

            instance = new MainContentSingleton();

        }

        return instance;
    }


    public  void doInit(AppCompatActivity activity) {

        doInit(activity, KEY_MATE_1_COLLECTION);
    }



    public void doInit(AppCompatActivity activity, String MATE_COLLECTION_SELECTED) {

        // puntero
        MATE_COLLECTION = MATE_COLLECTION_SELECTED;
        idx = 0;

        mainContent = new MainContentSingleton.MainContent(activity);


        //Setup Seek Bar
        Drawable thumb = activity.getResources().getDrawable(R.drawable.seekbar_peon_24);
        // Drawable thumb = getSeekbarhumb(MATE_COLLECTION_SELECTED);

        // Drawable thumb =  AppUtiles.resizeImage(activity, R.drawable.pieza05_caballo, 24,24 );
        //Drawable thumb2 = new ScaleDrawable(thumb, 0, 24, 24).getDrawable();
         // thumb.setBounds(0, 0, 24, 24);
        // mainContent.getSeekBar().setThumb(thumb);
        mainContent.getSeekBar().setThumb(thumb);



        mainContent.getSeekBar().setProgress(idx);

        mainContent.getSeekBar().setMax(getMAX_Mate(MATE_COLLECTION));

        mainContent.getTextView().setText(getTextProgressBar(MATE_COLLECTION_SELECTED));
        //image = image;
        mainContent.getChessSolution().setText("---");


        // listener

        mainContent.getSeekBar().setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = idx;


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Toast.makeText(getApplicationContext(), "Started tracking SeekBar", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;

                // Cambio el problema mientras se desliza la SeekBar
                mainContent.getTextView().setText("Ejercicio: " + progress + "/" + seekBar.getMax());
                idx = progresValue;
                navigate();
            }


            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                // Cambio el problema cuando se suelta la seekBar
                mainContent.getTextView().setText("Ejercicio: " + progress + "/" + seekBar.getMax());
                idx = progress;
                navigate();

            }
        });


        // init;
        firstProblem();

    }


    public void firstProblem() {

        Log.d(TAG, "firstProblem("+MATE_COLLECTION+"): " + idx);

        idx = 0;
        navigate();
    }

    public void lastProblem() {

        Log.d(TAG, "lastProblem("+MATE_COLLECTION+"): " + idx);

        idx = getMAX_Mate(MATE_COLLECTION);
        navigate();
    }

    public void prevProblem() {

        Log.d(TAG, "prevProblem("+MATE_COLLECTION+"): " + idx);

        if (idx > 0) {
            idx--;
        }

        navigate();
    }

    public void nextProblem() {

        Log.d(TAG, "nextProblem("+MATE_COLLECTION+"): " + idx);

        if (idx < getMAX_Mate(MATE_COLLECTION)) {
            idx++;
        }

        navigate();
    }


    private void navigate() {

        Log.d(TAG, "navigate("+MATE_COLLECTION+"): " + idx);


        mainContent.getSeekBar().setProgress(idx);
        setImageResource(MATE_COLLECTION, idx);

        // Toast.makeText(this, "Boton Click", Toast.LENGTH_SHORT);


    }
    
    private void setImageResource(String MATE_COLLECTION, int idx)
    {

        String imagename = getImageNage(MATE_COLLECTION, idx);

        int res = mainContent.getActivity().getResources().getIdentifier(imagename, "drawable",
                mainContent.getActivity().getPackageName());

        mainContent.getImage().setImageResource(res);


    }



    private String getTextProgressBar(String MATE_COLLECTION) {

        String res = "Ejercicio: " + "0"+ "/" + this.mainContent.getSeekBar().getMax();

        return res;

    }

    private String getImageNage(String MATE_COLLECTION, int idx) {

        String sidx = String.format("%05d", idx);

        if (MATE_COLLECTION.equals(KEY_MATE_1_COLLECTION)) {
            return "chess_mate1_" + sidx;
        }

        if (MATE_COLLECTION.equals(KEY_MATE_2_COLLECTION)) {
            return "chess_mate2_" + sidx;
        }

        if (MATE_COLLECTION.equals(KEY_MATE_3_COLLECTION)) {
            return "chess_mate3_" + sidx;
        }

        if (MATE_COLLECTION.equals(KEY_MATE_4_COLLECTION)) {
            return "chess_mate4_" + sidx;
        }

        return "chess_mate1_" + sidx;
    }


    /*
    * Le sumo 1 porque arranco en cero
    * */
    private int getMAX_Mate(String MATE_COLLECTION) {

        if (MATE_COLLECTION.equals(KEY_MATE_1_COLLECTION)) {
            return MAX_MateEn1 + 1;
        }

        if (MATE_COLLECTION.equals(KEY_MATE_2_COLLECTION)) {
            return MAX_MateEn2 + 1;
        }

        if (MATE_COLLECTION.equals(KEY_MATE_3_COLLECTION)) {
            return MAX_MateEn3 + 1 ;
        }

        if (MATE_COLLECTION.equals(KEY_MATE_4_COLLECTION)) {
            return MAX_MateEn4 + 1;
        }

        return MAX_MateEn1 + 1;

    }



    private Drawable getSeekbarhumb(String MATE_COLLECTION_SELECTED) {

        int r_draw = R.drawable.seekbar_peon_24;


        if (MATE_COLLECTION.equals(KEY_MATE_1_COLLECTION)) {
            r_draw = R.drawable.pieza06_peon;
        }

        if (MATE_COLLECTION.equals(KEY_MATE_2_COLLECTION)) {
            r_draw = R.drawable.pieza05_caballo;
        }

        if (MATE_COLLECTION.equals(KEY_MATE_3_COLLECTION)) {
            r_draw = R.drawable.pieza03_torre;
        }

        if (MATE_COLLECTION.equals(KEY_MATE_4_COLLECTION)) {
            r_draw = R.drawable.pieza01_rey;
        }

        Drawable thumb = mainContent.getActivity().getResources().getDrawable(r_draw);

        return thumb;
    }
}
