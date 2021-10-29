package array;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int len = scan.nextInt();
        int[] score = new int[len];
        System.out.println("输入" + len + "个学生的成绩");
        for (int i = 0; i < len; i++) {
            score[i] = scan.nextInt();
        }
        int max = score[0];
        for (int i = 0; i < len; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        System.out.println("最高分是:" + max);
        findgrade find = new findgrade();
        for (int i = 0; i < len; i++) {
            System.out.println("student "+i+"score is "+score[i]+"grade"+find.findgrade(score[i],max));

        }

    }
}
class findgrade {
    public char findgrade(int score, int max) { //这里也可直接声明为static，就可以不用再主函数创建实例，不过不建议！

        if (max - score  <= 10) {
            return 'A';
        } else if (max - score <= 20) {
            return 'B';
        } else if (max - score <= 30) {
            return 'C';
        } else {
            return 'D';
        }

    }
}

