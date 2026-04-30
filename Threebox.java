import java.util.*;

abstract class ThreeDObject {
    abstract void wholeSurfaceArea();
    abstract void volume();
}

class Box extends ThreeDObject {
    double l,b,h;

    Box(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }

    void wholeSurfaceArea(){
        System.out.println("Surface Area of Box = "+2*(l*b+b*h+h*l));
    }

    void volume(){
        System.out.println("Volume of Box = "+(l*b*h));
    }
}

class Cube extends ThreeDObject {
    double a;

    Cube(double a){
        this.a=a;
    }

    void wholeSurfaceArea(){
        System.out.println("Surface Area of Cube = "+6*a*a);
    }

    void volume(){
        System.out.println("Volume of Cube = "+a*a*a);
    }
}

class Cylinder extends ThreeDObject {
    double r,h;

    Cylinder(double r,double h){
        this.r=r;
        this.h=h;
    }

    void wholeSurfaceArea(){
        System.out.println("Surface Area of Cylinder = "+(2*Math.PI*r*(r+h)));
    }

    void volume(){
        System.out.println("Volume of Cylinder = "+(Math.PI*r*r*h));
    }
}

class Cone extends ThreeDObject {
    double r,h,l;

    Cone(double r,double h){
        this.r=r;
        this.h=h;
        l=Math.sqrt(r*r+h*h);
    }

    void wholeSurfaceArea(){
        System.out.println("Surface Area of Cone = "+(Math.PI*r*(r+l)));
    }

    void volume(){
        System.out.println("Volume of Cone = "+(Math.PI*r*r*h/3));
    }
}

public class Main {
    public static void main(String args[]){
        ThreeDObject obj;

        obj=new Box(5,4,3);
        obj.wholeSurfaceArea();
        obj.volume();

        obj=new Cube(4);
        obj.wholeSurfaceArea();
        obj.volume();

        obj=new Cylinder(3,5);
        obj.wholeSurfaceArea();
        obj.volume();

        obj=new Cone(3,5);
        obj.wholeSurfaceArea();
        obj.volume();
    }
}