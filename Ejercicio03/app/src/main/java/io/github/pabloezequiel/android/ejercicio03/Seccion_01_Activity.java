package io.github.pabloezequiel.android.ejercicio03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Pablo Ezequiel on 30/7/16.
 * <p/>
 * ProbarNoCuestaNada.com
 * <p/>
 * https://github.com/PabloEzequiel
 * https://javaen.blogspot.com
 */
public class Seccion_01_Activity extends Activity {

    public static String TAG = Seccion_01_Activity.class.getSimpleName();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_01);

        Log.d(TAG, "Seccion_01_Activity.onCreate()");



        //Este código se inserta en el método onCreate() de la actividad.
        Intent intent = this.getIntent();
        if (intent == null){
            Log.d(TAG, "La actividad no se ha llamado mediante un intent.");
        } else {

            Log.d(TAG, "La actividad SI se ha llamado mediante un intent.");

            //Obtener un bundle
            Bundle b = intent.getExtras();

            try{

                boolean bValue1 = b.getBoolean("param_boolean_value");
                boolean bValue2 = (boolean) b.get("param_boolean_value");

                Log.d(TAG, "Bundle " + b);
                Log.d(TAG, "Boolean Value 1: " + bValue1);
                Log.d(TAG, "Boolean Value 2: " + bValue2);

                // boolean b = b.ge


            } catch (Exception e) {

                Log.d(TAG, "Exception " + e.getMessage());
            }

        }

    }



}
