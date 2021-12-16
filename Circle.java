public class Circle extends GeometricObject{
private double radius;
private double area;
private double perimeter;
private double diameter;
private String printCircle;
private String color;
private boolean filled;
public Circle(){
    
}
public Circle(double radius){
    this.radius = radius;
}
public Circle(double radius, String color1, boolean filled){
    this.radius = radius;
    this.color = color;
    this.filled = filled;
}
public double getRadius(){
    return radius;
}
public void setRadius(double newRadius){
    newRadius = radius;
}public double getArea(){
    double area = radius*radius*Math.PI; 
    return area;
}
public double getPerimeter(){
    double perimeter = 2*radius*radius*Math.PI;
    return perimeter;
}
public double getDiameter(){
    double diameter = 2* radius;
    return diameter;
}
public void setPrintCircle(String newPrintCircle){
newPrintCircle = printCircle;
}
}