package com.example.systembank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import java.util.jar.Attributes.Name

class ListViewApp : AppCompatActivity() {
    private var lvName:ListView?=null
    private var tvSelection:TextView?=null

    private val name = arrayOf("Maria","Alexandra", "Kevin")
    private val posiciones = arrayOf("1","2","3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvName = findViewById(R.id.Lv_Names)
        tvSelection = findViewById(R.id.textView4)

        var adaptador:ArrayAdapter<String> = ArrayAdapter<String>(this,R.layout.activity_main,name)
        lvName?.adapter=adaptador

        lvName?.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick( parent: AdapterView<*>?, view: View?, position: Int,id: Long) {
                tvSelection?.text = "La posición Name ${lvName?.getItemAtPosition(position)} es ${posiciones[position]}"
            }


        }

    }
}

