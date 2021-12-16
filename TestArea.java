public class TestArea{
    public static void main(String [] args){
        Rectangle m = new Rectangle(5.0,3.0,"white" ,true);
        
        System.out.println("the area is" + m.getArea());
       
        System.out.println("the color is" + m.getColor());
        System.out.println("the filled is" + m.isFilled());
         System.out.println("the perimeter is" + m.getPerimeter());

         Circle c1 = new Circle( 5.0);
          System.out.println("the area is" + c1.getArea());
         System.out.println("the perimeter is" + c1.getPerimeter());
          System.out.println("the diameter is" + c1.getDiameter());
        Rectangle m1 = new Rectangle();
         System.out.println(m1.getDateCreated());

    }
}