package layout

import org.w3c.dom.NameList

class Names(val names:String,var edad:Int, val Name:Array<NamesProgram>,val amigo:Array<Names>?=null) {
    enum class NamesProgram{
        MARIA,
        ALEXANDRA,
        KEVIN,


    }


    fun Name(){
        for(Names:NamesProgram in Name){
            println("Se Nombres de programacion en $Names")
        }
    }
}
