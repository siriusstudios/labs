import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println(circle.area());
    }
}


class Rectangular {
    protected int minor_axis;
    protected int major_axis;

    public Rectangular(int minor_axis, int major_axis) {
        this.minor_axis = minor_axis;
        this.major_axis = major_axis;
    }

    int perimeter() {
        return 2 * (major_axis + minor_axis);
    }

    double area() {
        return major_axis * minor_axis;
    }
}

class Triangle {
    protected int side_one;
    protected int side_two;
    protected int side_three;
    protected int altitude;

    public Triangle(int side_one, int side_two, int side_three, int altitude) {
        this.side_one = side_one;
        this.side_two = side_two;
        this.side_three = side_three;
        this.altitude = altitude;
    }

    int perimeter() {
        return side_one + side_two + side_three;
    }

    double area() {
        return side_one * altitude;
    }
}

class Circle {
    private final int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * (this.radius * 2);
    }

    double perimeter() {
        return 2 / (Math.PI * this.radius);
    }

}

class Ellipse {
    protected int minor_axis;
    protected int major_axis;

    Ellipse(int minor_axis, int major_axis) {
        this.minor_axis = minor_axis;
        this.major_axis = major_axis;
    }

    double perimeter() {
        return Math.PI * (3 * (major_axis + minor_axis) - Math.sqrt((3 * major_axis + minor_axis) * (major_axis + 3 * minor_axis)));
    }

    double area() {
        return Math.PI * major_axis * minor_axis;
    }
}

/*Those classes are completely inherited and they dont need unque features to them.*/
class Rectangle extends Rectangular {
    Rectangle(int minor_axis, int major_axis) {
        super(minor_axis, major_axis);
    }
}

class Square extends Rectangular {
    public Square(int minor_axis, int major_axis) {
        super(minor_axis, major_axis);
    }
}
