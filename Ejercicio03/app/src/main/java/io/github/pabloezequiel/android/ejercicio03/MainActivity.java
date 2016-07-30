package io.github.pabloezequiel.android.ejercicio03;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static String TAG = MainActivity.class.getSimpleName();

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

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action

            Log.d(TAG, "Opcion 01: Camera");

            invokeMiActivity(this);


        } else if (id == R.id.nav_gallery) {

            Log.d(TAG, "Opcion 02: Gallery");

            invokeMiActivity_V2(this);

        } else if (id == R.id.nav_slideshow) {


            Log.d(TAG, "Opcion 03: Slide Show");

            //invokeMiActivity_V3(this);
            invokeMiActivity_V4(this);

        } else if (id == R.id.nav_manage) {

            Log.d(TAG, "Opcion 04: Nav Manage");
            invokeIntentFromClass(this);

        } else if (id == R.id.nav_share) {

            Log.d(TAG, "Opcion 05: Share");

        } else if (id == R.id.nav_send) {

            Log.d(TAG, "Opcion 06: Send");

            // showMapAtLatLong(this);
            // dial(this);
            // invokeWebBrowser(this);
            // invokeWebSearch(this);



        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    /**
     * No se para que se utiliza esto de las acciones ..
     * @param activity
     */
    public static void invokeMiActivity(Activity activity) {
        String actionName = "seccion.01.accion.nombreAccion";
        Intent intent = new Intent(actionName);
        activity.startActivity(intent);
    }

    // I am following samples from:

    // http://www.vogella.com/tutorials/AndroidIntent/article.html#starting-other-android-components-via-intents
    /**
     * Pasaje de parametros a los intenst
     */
    public static void invokeMiActivity_V2(Activity activity) {


        Intent i = new Intent(activity, Seccion_01_Activity.class);

        // Pasaje de Parametros al Intent

        //Colocar un bundle en un intent
        //
        i.putExtra("param_boolean_value", true);


        Bundle b2 = new Bundle();

        activity.startActivity(i);

    }


   // Intents : Officical documentation
   //  https://developer.android.com/reference/android/content/Intent.html


    /**
     * Invocacion Intent explícito
     * @param activity
     */
    public static void invokeMiActivity_V3(Activity activity) {
        Intent intent = new Intent(activity, Seccion_01_Activity.class);
        activity.startActivity(intent);
    }

    /**
     * From stackOverflow
     * @param activity
     */
    public static void invokeMiActivity_V4(Activity activity) {
        Intent myIntent = new Intent(activity, Seccion_01_Activity.class);
        myIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(myIntent);
    }

    /**
     * Otra variante:
     *
     * http://www.aprendeandroid.com/l3/fundamentos3.htm
     * Por ultimo, vamos a ver como lanzar el activity que contendrá la clave 'nombre',
     * para eso necesitamos dos parámetros, uno desde donde lo vamos a lanzar, y el segundo, que activity vamos a lanzar.
     * @param activity
     */
    public  void invokeIntentFromClass(Activity activity) {
        Intent intent = new Intent();
        intent.putExtra("Nombre", "Pablo Ezequiel");

        intent.setClass(MainActivity.this, Seccion_01_Activity.class);

        startActivity(intent);
    }

    // Availables Intents from Android documetnation
    // https://elbauldelprogramador.com/programacion-android-intents-conceptos/
    // https://elbauldelprogramador.com/programacion-android-intents-categorias/


    public static void invokeWebBrowser(Activity activity) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://javaen.blogspot.com"));
        // intent.setData(Uri.parse("http://www.google.com"));
        activity.startActivity(intent);
    }

    public static void invokeWebSearch(Activity activity) {
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.setData(Uri.parse("http://www.google.com"));
        activity.startActivity(intent);
    }

    public static void showMapAtLatLong(Activity activity){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?z=4&q;=restaurantes"));
        activity.startActivity(intent);
    }

    public static void dial(Activity activity) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        activity.startActivity(intent);
    }

    public static void call(Activity activity) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:555-555-555"));
        if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        activity.startActivity(intent);
    }


    // OTROS
    // Content Provider
    // https://elbauldelprogramador.com/programacion-android-ejemplos-de-uso-de/
    // https://elbauldelprogramador.com/programacion-android-implementando-un/
    // Interesante .. pero no se para que lo podría llegar a utilizar


}
