package com.probarnocuestanada.chess.chesslab03;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

/**
 * Created by Pablo Ezequiel on 19/6/16.
 * <p/>
 * ProbarNoCuestaNada.com
 * <p/>
 * https://github.com/PabloEzequiel
 * https://javaen.blogspot.com
 */
public class UserSettingsActivity extends PreferenceActivity
                                 implements SharedPreferences.OnSharedPreferenceChangeListener {

    public static String TAG = UserSettingsActivity.class.getSimpleName();



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        addPreferencesFromResource(R.xml.settings);

        //getActionBar().setDisplayShowTitleEnabled(true);

        // para que se vea el volver
        // Funciiona con los estilos:
        // -- @style/AlertDialog.AppCompat.Light
        // getActionBar().setDisplayHomeAsUpEnabled(true);


    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        LinearLayout root = (LinearLayout)findViewById(android.R.id.list).getParent().getParent().getParent();
        Toolbar bar = (Toolbar) LayoutInflater.from(this).inflate(R.layout.settings_toolbar, root, false);
        root.addView(bar, 0); // insert at top
        bar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



    @Override
    protected void onResume() {
        super.onResume();
        getPreferenceScreen().getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences()
                .unregisterOnSharedPreferenceChangeListener(this);
    }


    // Esta en settings.xml --> prefIdiomas
    public static final String KEY_PREF_IDIOMAS = "prefIdiomas";




    /**
     * Called when a shared preference is changed, added, or removed. This
     * may be called even if a preference is set to its existing value.
     * <p/>
     * <p>This callback will be run on your main thread.
     *
     * @param sharedPreferences The {@link SharedPreferences} that received
     *                          the change.
     * @param key               The key of the preference that was changed, added, or
     */
    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

        Log.d(TAG, "Preference Changed: " + key );

        if (key.equals(KEY_PREF_IDIOMAS)) {

            SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
            String language = settings.getString(KEY_PREF_IDIOMAS, "");

            doChangeLocale(language);
        }
    }

    /**
     * Cambia el lenguaje de la aplicacion
     *
     * Esta variante no es la mejor desde el punto de vista UX
     * porque hace recargar la vista....
     * Otras posibilidades es invocar a un updateUI() mas artesanal.
     *
     *
     * @param language
     */
    private void doChangeLocale(String language) {

        Log.d(TAG, "doChangeLocale(" + language + ")");

        Locale locale = new Locale(language);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = locale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainActivity.class);
        refresh.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(refresh);
        finish();

    }


    /*
    MenuItem nav_mate1;
    MenuItem nav_mate2;
    MenuItem nav_mate3;
    MenuItem nav_mate4;

    MenuItem action_about;
    MenuItem action_settings;

    private void updateUI() {

        Resources resources = getResources();

        // Menu Left
        nav_mate1 = (MenuItem) findViewById(R.id.nav_mate1);   // Es todo null ?? Por que?
        nav_mate2 = (MenuItem) findViewById(R.id.nav_mate2);
        nav_mate3 = (MenuItem) findViewById(R.id.nav_mate3);
        nav_mate4 = (MenuItem) findViewById(R.id.nav_mate4);

        nav_mate1.setTitle(resources.getString(R.string.menu_mate_en_1));
        nav_mate2.setTitle(resources.getString(R.string.menu_mate_en_2));
        nav_mate3.setTitle(resources.getString(R.string.menu_mate_en_3));
        nav_mate4.setTitle(resources.getString(R.string.menu_mate_en_4));

        // Menu Toolbar
        action_settings = (MenuItem) findViewById(R.id.action_settings);
        action_settings.setTitle(resources.getString(R.string.action_settings));

        action_about    = (MenuItem) findViewById(R.id.action_about);
        action_about.setTitle(resources.getString(R.string.action_about));



    }
    */

}
