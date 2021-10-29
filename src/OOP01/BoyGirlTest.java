package OOP01;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",22);
        boy.shout();
        Girl girl = new Girl("朱丽叶",19);
        girl.marry(boy);
        Girl girl1 = new Girl("祝英台",18);
        int compare = girl.compare(girl1);
        if(compare>0){
            System.out.println("朱丽叶年龄大");
        }


    }

}

