package com.example.pabloin.ejercicio02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.pabloin.ejercicio02.core.Producto;
import com.example.pabloin.ejercicio02.core.ProductoAdapter;

public class MainActivity extends AppCompatActivity
        implements frgmt_listado.Callback {


    private static final String TAG = ProductoAdapter.class.getSimpleName();

    private boolean esTablet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.texto_titulo_tablet)!=null) {
            esTablet = true;
        }

        Log.d(TAG, "Es Tablet " + esTablet);
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


    public void cambiarTextos() {

        // Modificamos el texto (Fragmento I):
        TextView tv = (TextView)  this.findViewById(R.id.texto_hello);
        tv.setText("Texto en el Fragmento 1 modificado");

        // Modificamos el texto (Fragmento II):
        TextView tv2 = (TextView)  this.findViewById(R.id.texto_nombre);
        tv2.setText("Texto en el Fragmento 2 modificado");

    }




    @Override
    public void onProductoSelected(Producto productoSelected) {

        TextView tv_id         = (TextView) this.findViewById(R.id.texto_id);
        TextView tv_nombre     = (TextView) this.findViewById(R.id.texto_nombre);
        TextView tv_descipcion = (TextView) this.findViewById(R.id.texto_descripcion);
        TextView tv_precio     = (TextView) this.findViewById(R.id.texto_precio);

        tv_id.setText("" + productoSelected.getId());
        tv_nombre.setText(productoSelected.getNombre());
        tv_descipcion.setText(productoSelected.getDescripcion());
        tv_precio.setText("" + productoSelected.getPrecio());

    }
}
