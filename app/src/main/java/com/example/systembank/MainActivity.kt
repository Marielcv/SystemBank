package com.example.systembank

import android.os.Bundle
import android.text.Selection
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var etName: EditText?=null
    lateinit var : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }

    enum class Departamentos (val dir:Int){
        SANSALVADOR (1),SANTAANA (-1),SANMIGUEL (1),CHALATENANGO(-1);

        fun descripcion():String{
            return when(this){
                SANSALVADOR -> "La dirección es San Salvador"
                SANTAANA -> "La dirección es Santa Ana "
                SANMIGUEL -> "La dirección es San Miguel"
                CHALATENANGO -> "La dirección es Chalatenango"
            }
        }
    }
