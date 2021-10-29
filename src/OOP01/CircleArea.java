package OOP01;

public class CircleArea {
    public static void main(String[] args) {
        Circle c1 = new Circle();   //先造一个对象！！！！
        c1.radius=2.2;
        System.out.println(c1.findArea());

    }
}
class Circle{
    double radius;

    public double findArea(){
        return Math.PI*radius*radius;

    }

}