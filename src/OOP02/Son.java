package OOP02;

public class Son extends Parent {
    public static void main(String[] args) {
        Son son = new Son();
        son.setAge(10);
        son.printName();
        son.run();
        Parent parent = new Son();
        /**
         * 不能调用子类所特有的方法！！！
         * parent。out()  不会成功
         * 因为编译时就是Parent类型
         */
        //parent.out()   编译不通过
        /**
         * 有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，
         * 导致编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。
         * 如何才能调用子类特的属性和方法？使用向下转型。
         */
        Son son1 = (Son) parent;//强转可能会出现异常！
        son1.out();

        /**
         *  a instanceof A  判断对象a是否是类A的实例。如果是返回true，否则false
         */

        if(parent instanceof Son){
            Son son2 = (Son) parent;
            son2.out();
        }
    }

    @Override
    public void printName() {
        System.out.println("方法重写！！！！");
    }


    @Override
    public void run() {
        super.run();
    }

    public void out() {
        System.out.println("This is sons method");
    }


}
