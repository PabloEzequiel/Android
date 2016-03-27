package com.example.pabloin.ejercicio02.core;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pablo Ezequiel on 27/3/16.
 * <p/>
 * ProbarNoCuestaNada.com
 * <p/>
 * https://github.com/PabloEzequiel
 * https://javaen.blogspot.com
 */
public class ProductoFactory {

    private static final String TAG = ProductoFactory.class.getSimpleName();

    private static List<Producto> productos;

    private ProductoFactory() {

    }

    public static List<Producto> getInstance() {

        if (productos == null) {

            productos = new ArrayList<Producto>();

            productos.add(new Producto(1L,  "Bicicleta",   "Bicicleta Rodado 26", 280));
            productos.add(new Producto(2L,  "Triciclo",    "Triciclo Nena", 240));
            productos.add(new Producto(3L,  "Monopatin",   "Monopatin de Aluminio", 120));
            productos.add(new Producto(4L,  "Patineta",    "Patineta 43x18", 280));
            productos.add(new Producto(5L,  "Rollers",     "Rollers Adulto 42", 170));
            productos.add(new Producto(6L,  "Patines",     "Patines niña 26", 199));
            productos.add(new Producto(7L,  "Karting",     "Karting modelo VW", 110));
            productos.add(new Producto(8L,  "Rasti",       "Rasti Transporte 175 PIEZAS", 150));
            productos.add(new Producto(9L,  "Playmobil",   "Playmobil 9512 Animales Marinos", 360));
            productos.add(new Producto(10L, "Rompecabeza", "Rompecabeza de 150 piezas", 72));
            productos.add(new Producto(11L, "Andador",     "Andador Elefante niño", 430));
            productos.add(new Producto(12L, "Barrilete",   "Barrilete Hombre Araña", 550));
            productos.add(new Producto(13L, "Metegol",     "Metegol Junior", 930));
            productos.add(new Producto(14L, "Pelota",      "Pelota Futbol Nro 5 Barcelona", 860));
            productos.add(new Producto(15L, "Memotest",    "Juego Memotest Grande", 970));

        }

        Log.d(TAG, "ProductoFactory: " + productos);

        return productos;
    }
}
