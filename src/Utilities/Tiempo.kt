package Utilities

const val region1: String = "MEX"
const val region2: String = "COL"
const val region3: String = "ARG"

class Tiempo(var hora: Int=0, var minuto: Int=0, var segundo: Int=0) {
    fun retornarHuzoHorario(region: String):String{
        when (region) {
            region1 -> return "region: "+region1+"hora: "+ (hora+1)%24+"minuto: "+minuto+"segundos: "+segundo

            region2 -> return "region: "+region1+"hora: "+ (hora+2)%24+"minuto: "+minuto+"segundos: "+segundo
            region3 -> return "region: "+region1+"hora: "+ (hora+3)%24+"minuto: "+minuto+"segundos: "+segundo
            else -> { // Note the block
                return "error"
            }
        }

    }
}