package OOP02;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public class Circle extends GeometricObject{
    double radius;

    public Circle(double radius,String color,double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}
