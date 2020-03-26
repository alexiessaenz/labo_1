package Figures

import com.saenz.labo1.Figures.Figure

class Cuadrado ( var lado:Float, var nombre: String): Figure {
    override var name: String =nombre

    override fun perimeter(): Float {
        return 4*lado
    }

    override fun surface(): Float {
        return lado*lado
    }
}