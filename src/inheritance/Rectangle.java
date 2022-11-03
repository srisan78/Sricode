package inheritance;

public class Rectangle {
int sides;
double length;
double width;
double area;
double perimeter;
public double ara(double length,double width){
    area=length*width;
   return area;
}
public double getPerimeter(double length,double width){
    perimeter=2*(length+width);
    return perimeter;
}
}
