package Abstract;

public class ShapeTest {
    public static void main(String[] args) {


        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());


    }
}