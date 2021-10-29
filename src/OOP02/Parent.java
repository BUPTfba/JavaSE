package OOP02;

public class Parent {
    String name;
    private int age;

    public void printName(){
        System.out.println(name);
    }

    private void printAge(){
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void run(){
        System.out.println("run!");
    }
}
