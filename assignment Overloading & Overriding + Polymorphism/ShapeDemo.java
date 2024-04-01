abstract class Shape{
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double area() {
        return Math.PI * (radius*radius);
    }
    public double perimeter() {
        return 2 * Math.PI * (radius*radius);
    }
}
class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length*width;
    }

    public double perimeter(){
        return 2 * length * width;
    }
}

class Square extends Shape{
    double height;

    public Square(double height){
        this.height = height;
    }
    public double area(){
        return height*height;
    }

    public double perimeter(){
        return 4 * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Circle(3.4);
        System.out.printf("Area of circle:%.2f   Perimeter of circle:%.2f%n",shape.area(),shape.perimeter());
        shape = new Rectangle(4.5,6.7);
        System.out.printf("Area of Rectangle:%.2f   Perimeter of Rectangle:%.2f%n",shape.area(),shape.perimeter());
        shape = new Square(7.8);
        System.out.printf("Area of Square:%.2f   Perimeter of Square:%.2f%n",shape.area(),shape.perimeter());
    }
}
