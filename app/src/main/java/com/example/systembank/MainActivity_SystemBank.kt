package com.example.systembank

import android.os.Bundle
import android.text.Selection
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity_SystemBank : AppCompatActivity() {
    var etView: EditText? = null
    lateinit var etName: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    enum class Departamentos(val dir: Int) {
        SANSALVADOR(1), SANTAANA(-1), SANMIGUEL(1), CHALATENANGO(-1);

        fun descripcion(): String {
            return when (this) {
                SANSALVADOR -> "El Departamento es San Salvador"
                SANTAANA -> "El Departamento es Santa Ana "
                SANMIGUEL -> "El Departamento es San Miguel"
                CHALATENANGO -> "El Departamento es Chalatenango"
            }
        }
    }
}