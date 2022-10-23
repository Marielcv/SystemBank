package layout

class Names(val names:String,var edad:Int, val Names:Array<NamesProgram>,val amigo:Array<Names>?=null) {
    enum class NamesProgram{
        MARIA,
        ALEXANDRA,
        KEVIN,


    }


    fun codigo(){
        for(Names:NamesProgram in Names){
            println("Se Nombres de programacion en $Names")
        }
    }
}
