package OOP02;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {

        //1.实例化Scanner，用于从键盘获取学生成绩
        Scanner scanner = new Scanner(System.in);
        //2.创建Vector对象：Vector v= new Vector();相当于原来的数组
        Vector v = new Vector();
        int maxScore = 0;
        //3.通过fori，给Vector添加数组
        //3.1添加操作v.addElement(Object obj)
        //3.2当输入是负数时，跳出循环
        //4.获取学生最大成绩
        for (; ; ) {
            System.out.println("请输入学生成绩，负数代表输入结束");
            int score = scanner.nextInt();
            if(score>100){
                System.out.println("重新输入");
            }
            if (score < 0) {
                break;
            } else {
                Integer integer = score;
                v.addElement(integer);
            }
            if(maxScore<score){
                maxScore  = score;
            }

        }
        //5.便利Vector，得到每个学生成绩，并与最大成绩做对比，带到每个学生的等级
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            int sc = (Integer) obj;
            if(maxScore-sc<=10){
                level = 'A';
            }else{
                level= 'B';
            }
            System.out.println(level);
        }
    }
}
