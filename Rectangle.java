public class Rectangle extends GeometricObject{
    private double widith;
    private double hieght;
    private String color;
    private boolean filled;
    private double area;
    private double perimeter;
     private java.util.Date dateCreated;

    public Rectangle(){
        dateCreated = new java.util.Date();
       }

    public Rectangle(double widith, double hieght){
        this.widith = widith;

        this.hieght = hieght;
    }
    public Rectangle(double widith,double hieght,String color,boolean filled){
        this.widith = widith;
        this.hieght = hieght;
        this.color = color;
        this.filled = filled;
    }
    public double getWidith(){
        return widith;
    }
    public void setWidith(double newWidith){
        newWidith = widith;
    }public double getHieght(){
        return hieght;
    }
    public void setHieght(double newHieght){
        newHieght = hieght;
    }
    public double getArea(){
        area = widith * hieght;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 * (widith + hieght);
        return perimeter;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public boolean isFilled(){
        return true;
    }
     public String getColor(){
        return color;
    }

}