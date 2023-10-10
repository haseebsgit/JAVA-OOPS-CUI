public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    public double calculatePerimeter(double radius) {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }
}
