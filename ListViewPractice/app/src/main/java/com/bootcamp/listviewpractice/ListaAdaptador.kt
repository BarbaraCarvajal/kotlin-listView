package com.bootcamp.listviewpractice

import android.content.Context
import android.widget.ArrayAdapter

class ListaAdaptador(context: Context, dataArrayList: ArrayList<ListData?>?):
    ArrayAdapter<ListData?>(context, R.layout.list_item, dataArrayList!!){

    }