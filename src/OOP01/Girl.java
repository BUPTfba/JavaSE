package OOP01;

public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void marry(Boy boy) {
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }
    public int compare(Girl girl){
        if(this.age> girl.age){
            return 1;
        }else if (this.age== girl.age){
            return 0;
        }else{
            return -1;
        }
    }
}