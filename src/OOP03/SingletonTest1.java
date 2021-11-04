package OOP03;


/**
 * 单例设计模式
 */
public class SingletonTest1 {


}

/**
 * 饿汉式！！！
 */
class Bank{
    //1.私有化类的构造器
    private Bank(){

    }
    //2.内部创建类的对象  4.要求该对象声明，也必须为静态的
    private static Bank instance = new Bank();

    //3.提供公共的方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
