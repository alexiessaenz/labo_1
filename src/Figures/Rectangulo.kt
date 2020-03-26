package com.saenz.labo1.Figures

class Rectangulo(var base: Float, var altura: Float, name: String):Figure{
    override var name: String = name


    override fun perimeter(): Float {
        return 2*(base+altura)
    }

    override fun surface(): Float {
        return base*altura
    }


}