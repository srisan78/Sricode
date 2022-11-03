package inheritance;

public class Circle extends Shapes{
    private double radius;
   private double pi=3.142;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        area = pi * radius * radius;
        return area;

    }
    public double getPerimeter(){
        perimeter=2*pi*radius;
        return perimeter;
    }
}

