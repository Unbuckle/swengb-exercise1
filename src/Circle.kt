package fh.joanneum.swengb.lab1

class Circle(color: String = "black", val radius: Double = 1.0): Shape(color){
    override fun getArea(): Double {
        return radius * radius * Math.PI
    }
    override fun toString(): String {
        return "Circle(radius=$radius, color=$color)"
    }
}

