package OOP02;

public class AreaTest {
    public boolean equalsArea(GeometricObject o1,GeometricObject o2){  //多态性！！！！！！！
//        if(o1.findArea()==o2.findArea()){
//            return true;
//        }else {
//            return false;
//        }
        return o1.findArea()==o2.findArea();

    }

    public static void main(String[] args) {
        Circle circle = new Circle(10,"red",10);
        MyRectangle myRectangle = new MyRectangle("red",10,5,4);
        boolean flag =new AreaTest().equalsArea(circle,myRectangle);
        System.out.println(flag);


    }




}
