package item23;

abstract class AbsFigure{
    abstract double area();
}

public class Circle extends AbsFigure{

    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double area() {
        return Math.PI * (radius * radius);
    }

}
