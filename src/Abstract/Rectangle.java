package Abstract;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
       this.length = length;
       this.breadth = breadth;

    }

    private void setBreadth(double breadth) {
    }

    private void setLength(double length) {
    }

    public double getLength() {
        return length;
    }




    public double getBreadth() {
        return breadth;
    }



    @Override
    double calculateArea() {
        return length * breadth;
    }


}
