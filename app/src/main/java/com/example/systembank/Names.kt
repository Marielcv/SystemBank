package com.example.systembank

class Names(val nombre:String,var edad:Int, val lenguajes:Array<progra>,val amigo:Array<Names>?=null) {
    enum class progra{
        MARIA,
        ALEXANDRA,
        KEVIN
    }


    fun codigoName(){
        for(lenguaje:progra in lenguajes){
            println(" Names de progra en $lenguaje")
        }
    }
}