package com.example.pabloin.ejercicio01;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private primer_fragmento fragmento_01;
    private segundo_fragmento fragmento_02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmento_01 = (primer_fragmento) getFragmentManager().findFragmentById(R.id.fragmento_01);
        fragmento_02 = (segundo_fragmento) getFragmentManager().findFragmentById(R.id.fragmento_02);
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


    public void clickOnFirstFragment() {
        fragmento_01.onSelected(true);
      fragmento_02.onSelected(false);
    }



    public void clickOnSecondFragment() {
        fragmento_01.onSelected(false);
        fragmento_02.onSelected(true);
    }



}
