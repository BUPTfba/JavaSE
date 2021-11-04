package OOP03;

/**
 * 1.代码块的作用：用来初始化类或对象
 * 2.代码块如果有修饰只能用 static
 * 3.分类：静态代码块 vs 非静态代码块
 * 4.静态代码块：
 *      >内部可以有输出语句
 *      >随着类的加载而执行！！
 *      >如果有多个静态代码块，按顺序执行
 *      >静态代码块执行先于非静态
 *      >静态代码块内部只能调用静态的属性方法，不能调用非静态的结构
 * 5.非静态代码块：
 *      >内部可以有输出语句
 *      >随着对象的创建而执行！
 *      >每创建一次对象，就执行一次非静态代码块
 *      >作用：可以再创建对象时，对对象进行初始化
 *      静态--->（非静态）---->（构造器） 参考LeafTest
 *
 */

public class BlockTest {
    public static void main(String[] args) {
        String desc =Person.desc;
        Person p1= new Person();
        System.out.println(desc);
    }
}

class Person{
    //属性
    String name;
    int age ;
    static String desc = "我是一个人";

    //构造器
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    //方法
    public void eat(){

    }
    public static void info(){
        System.out.println("静态方法！！");
    }

    //代码块
    static {
        System.out.println("这是静态代码块！");
        desc="代码块改变";
    }

    {
        System.out.println("这是非静态代码块！");
    }

    @Override
    public String toString() {
        return "person [name="+name+",age="+age;
    }
}
