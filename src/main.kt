package fh.joanneum.swengb.lab1

fun main() {
    val testShape = Shape()
    println(testShape.color)

    val testRectangle = Rectangle(width = 5.0, length = 2.0)
    println(testRectangle.getArea())

    val testCircle = Circle(radius = 5.0)
    println(testCircle.getArea())

    println(testCircle)

    println(testRectangle)

    val circle1 = Circle(radius = 10.0, color = "red")
    val circle2 = Circle(radius = 10.0, color = "red")
    println(circle1 === circle2) // false
    println(circle1 == circle2) // true
    println(setOf<Circle>(circle1, circle2).size) // 1
}
