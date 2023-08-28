public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;   
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){ // Luas Persegi Panjang
        return length * width;
    }
    public double getPerimeter(){ // Keliling Persegi Panjang
        return 2 * (length + width);
    }
    public String toString(){
        return "Rectangle Width: "+width+"\nLength: "+length+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter()+super.toString();
    }
}