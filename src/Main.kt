import Figures.Circulo
import Figures.Cuadrado
import Utilities.Tiempo
import com.saenz.labo1.Figures.Figure
import com.saenz.labo1.Figures.Rectangulo
import com.saenz.labo1.Figures.Triangulo


    fun main(Args: Array<String>){

        val myArray= arrayListOf<Figure>()
        val fig1 = Rectangulo(12.0f,24.1f,"rectangulo")
        val fig2 = Cuadrado(12.0f,"cuadrado")
        val fig3 = Triangulo(12.0f,24.1f,"triangulo")
        val fig4 = Circulo(12.0f,"circulo")

        myArray.add(fig1)
        myArray.add(fig2)
        myArray.add(fig3)
        myArray.add(fig4)

        //println(myArray[0].surface())
        myArray.forEach(){
            println("i "+it.surface())
           // println("\t perimetro: "+ it.perimeter())
           // println("\t area: "+ it.surface())
        }

        val tiempo1 = Tiempo(12,23,12)
        val tiempo2 = Tiempo(hora=12, minuto = 23)
        val tiempo3 = Tiempo (minuto = 23)

    }
