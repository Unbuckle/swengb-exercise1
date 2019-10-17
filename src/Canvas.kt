package fh.joanneum.swengb.lab1

class Canvas(){
    private var shapes = mutableListOf<Shape>()

    fun addShape(shape: Shape){
        shapes.add(shape)
    }

    fun getTotalArea(): Double{
        return shapes.sumByDouble { it.getArea() }
    }

    fun shapesCountPerType(): Map<String, Pair<String, Int>> {
        return shapes.groupBy { it.javaClass.simpleName }.mapValues { it -> it.key to it.value.size }
    }
}


fun main() {
    val canvas = Canvas()
    canvas.addShape(Rectangle("white", width = 5.0, length = 2.0))
    canvas.addShape(Circle("red", radius = 1.0))
    println(canvas.getTotalArea()) //  13.14
}