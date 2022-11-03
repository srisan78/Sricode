package inheritance;

public class Square {
    public double sides;
    public double area;
public  double perimeter;
    public double getArea(double sides){
        area=sides*sides;
      return sides;

    }
public double getPerimeter(double sides){
        perimeter=2*(sides+sides);
        return perimeter;
}
}

