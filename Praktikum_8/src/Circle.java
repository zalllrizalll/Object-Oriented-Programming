import java.lang.Math;
public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){}
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){ // Luas Lingkaran
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){ // Keliling Lingkaran
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return "Circle Radius: "+radius+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter()+super.toString();
    }
}