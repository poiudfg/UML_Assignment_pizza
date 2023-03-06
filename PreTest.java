
class Shape{
    double circum ;  

    double getCircum(double radius) {
        return radius * 2 *3.14  ;
    }

    double getCircum(double length, double width) {
        return (length * 2) + (width * 2) ;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double l,double w){
        length = l;
        width = w;
        
    }

    public double getArea(){
        return length * width;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return length;
    }

    double getCircum(){
        return super.getCircum(length, width);
    }
}

class Circle extends Shape{
    double radius;

    public Circle(double r){
        radius = r;
    }

    public double getArea(){
        return 3.14 * (radius * radius);
    }

    double getCircum(){
        return super.getCircum(radius);
    }
}

public class PreTest{
    public static void main(String[] args) {
    Rectangle rect = new Rectangle(10,20);
    System.out.println("Rectangle width = " + rect.getWidth());
    System.out.println("Rectangle lenght = " +rect.getHeight());
    double area = rect.getArea();
    System.out.println("Rectangle area = "+ area);
    System.out.println("Rectangle circum = " + rect.getCircum());

    Circle cir = new Circle(5);
    System.out.println("Circle area = " + cir.getArea());
    System.out.println("Circle circum = " + rect.getCircum());
    }
}
