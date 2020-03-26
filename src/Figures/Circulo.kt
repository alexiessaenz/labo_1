package Figures

import com.saenz.labo1.Figures.Figure
const val PI: Double = 3.1416
class Circulo (var radio:Float,var nombre: String): Figure {

    override var name: String
        get() = name
        set(value) {
            name=nombre
        }

    override fun perimeter(): Float {
        return (PI*radio).toFloat()
    }

    override fun surface(): Float {
        return ((PI*radio*radio)/2).toFloat()
    }


}