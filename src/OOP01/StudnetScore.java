package OOP01;

import java.util.Random;

public class StudnetScore {
    public static void main(String[] args) {
        Student01[] stu = new Student01[20];
        for (int i = 0; i < stu.length; i++) {
            stu[i]=new Student01();       //数组实例化！！！！！！！
            stu[i].num=i;
            stu[i].state = (int) (Math.random()*(6-1+1)+1);
            stu[i].score = (int) (Math.random()*(100-0+1));

        }
        for (int i = 0; i < stu.length; i++) {
            System.out.println("学号"+stu[i].num+"班级"+stu[i].state+"成绩"+stu[i].score);

        }
        System.out.println("---------------");
        for (int i = 0; i < stu.length; i++) {
            if(stu[i].state==3)
                System.out.println("学号"+stu[i].num+"班级"+stu[i].state+"成绩"+stu[i].score);
        }
    }
}
class Student01{
    int num;
    int state;
    int score;
  //此处写方法也可以
    //return "xuehao"+num+"banji"+----------
}