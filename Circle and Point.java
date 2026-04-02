import java.util.Scanner;
class Point {
    int x, y;

    
    void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


class Circle {
    double radius;
    Point center; 

    
    Circle(double radius, int x, int y) {
        this.radius = radius;
        center = new Point();
        center.setPoint(x, y);
    }

    
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    void display() {
        System.out.println("Center of Circle: (" + center.x + ", " + center.y + ")");
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f\n", calculateArea());
    }
}


public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        
        Circle c = new Circle(radius, x, y);

        
        System.out.println("\nCircle Details:");
        c.display();

        sc.close();
    }
}