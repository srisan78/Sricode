package inheritance;

public class CalculateArea {
    public static void main(String[] args) {
        Circle c=new Circle();
c.setRadius(5);
double area=c.getArea(c.getRadius());

        System.out.println(area);


    }
}
