public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.6);
        System.out.println(c1.getRadius());
        System.out.println("Area : " + c1.calculatePerimeter(3.6));
        System.out.println("Perimeter : " + c1.calculateArea(3.6));
    }
}
