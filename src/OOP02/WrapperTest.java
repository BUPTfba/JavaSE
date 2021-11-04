package OOP02;

import org.junit.Test;

import java.net.PortUnreachableException;

public class WrapperTest {
    /**
     * 基本数据类型----->包装类
     *      （调用包装类的构造器）
     */
    @Test
    public void test1() {
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");//123abc不可
        System.out.println(in2.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1+"+"+f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("TruE");
        Boolean b3 = new Boolean("TruEabc");//false
        System.out.println(b1+"+"+b2+"+"+b3);

        OrderTest orderTest = new OrderTest();
        System.out.println(orderTest.isMale);  //false
        System.out.println(orderTest.isFemale);//null

    }
    /**
     * 包装类---->基本数据类型
     *      （调用包装类Xxx的xxxValue()）
     */
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1);
    }

    /**
     *  JDK5.0以后的自动装箱与拆箱
     */
    @Test
    public void test3(){
        int num =10;
        Integer integer = num;
        System.out.println(integer);
        int num1 = integer;
        System.out.println(num1);
    }

    /**
     * 基本数据类型---->String类型
     *      (调用String重载的valueOf)
     */
    public void test4(){
        //方式一
        int num1=10;
        String str1 = num1+"";
        //方式二
        float f1 =12.3f;
        String str2 = String.valueOf(f1);//"12.3"
        //方式三
    }

    /**
     *  String类型---->基本数据类型
     *      (调用包装类的parseXxx)
     */
    @Test
    public void test5(){
        String str1 = "123";
        int i1 = Integer.parseInt(str1);

    }

}
class OrderTest{
    boolean isMale;
    Boolean isFemale;
}