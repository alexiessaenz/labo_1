package com.saenz.labo1.Figures

class Rectangulo(var base:Float, var altura:Float, var nombre: String):Figure{
    override var name: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {

        }


    override fun perimeter(): Float {
        return 2*(base+altura)
    }

    override fun surface(): Float {
        return base*altura
    }


}