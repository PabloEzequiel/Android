package com.example.pabloin.ejercicio02.core;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.pabloin.ejercicio02.R;

import java.util.List;

/**
 * Created by Pablo Ezequiel on 27/3/16.
 * <p/>
 * ProbarNoCuestaNada.com
 * <p/>
 * https://github.com/PabloEzequiel
 * https://javaen.blogspot.com
 */
public class ProductoAdapter extends BaseAdapter {

    private static final String TAG = ProductoAdapter.class.getSimpleName();

    List<Producto> productos;


    public ProductoAdapter(List<Producto> productos) {

        this.productos = productos;
    }

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {

        return productos.size();
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {

        return productos.get(position);
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        Producto p = (Producto) productos.get(position);

        return p.getId();
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d(TAG, "ProductoAdapter.getView()");


        // Para los scroll, evitamos que se generen demaciados objetos:
        // El convertView es la priemar vista que sale de pantalla, asique recilcamos el objeto.
        // y no hacemos new,
        View view;

        if (convertView == null) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.adapter_listado_producto, parent, false);

        } else {

            view = convertView;
        }

        Producto p = productos.get(position);

        TextView tv_id     = (TextView) view.findViewById(R.id.producto_id);
        TextView tv_nombre = (TextView) view.findViewById(R.id.producto_nombre);
        TextView tv_precio = (TextView) view.findViewById(R.id.producto_precio);

        tv_id.setText(p.getId() + "");
        tv_nombre.setText(p.getNombre());
        tv_precio.setText("$ " + p.getPrecio() + "");

        return view;
    }
}
