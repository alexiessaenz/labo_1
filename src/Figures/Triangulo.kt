package com.saenz.labo1.Figures

import kotlin.math.sqrt

class Triangulo(var base:Float, var altura:Float, var nombre: String):Figure{
    override var name: String=nombre

    override fun perimeter(): Float {
        return base+altura+ sqrt(base*base+altura*altura)
    }

    override fun surface(): Float {
        return (base*altura)/2
    }


}