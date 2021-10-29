package OOP01;

public class StudnetScore02 {
    public static void main(String[] args) {
        Student02 stu2 = new Student02();
        stu2.init();
        stu2.info();
        stu2.sort();
        System.out.println("----------------------");
        stu2.out();

    }


}

class Student02 {
    int num;
    int state;
    int score;
    Student02[] stu02 = new Student02[20];
    Student02[] tempStu = new Student02[20];

    public void info() {

        for (int i = 0; i < stu02.length; i++) {
            System.out.println("学号" + stu02[i].num + "班级" + stu02[i].state + "成绩" + stu02[i].score);
        }


    }

    public void init() {
        for (int i = 0; i < stu02.length; i++) {
            /**
             * 此处的引用数据类型的数据还要初始化！！！！！！！！！！
             *
             */
            stu02[i] = new Student02();                               //数组实例化！！！！！！！
            stu02[i].num = i;
            stu02[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            stu02[i].score = (int) (Math.random() * (100 - 0 + 1));

        }
    }

    public void sort() {
        Student02 temp;
        tempStu = stu02;
        for (int i = 0; i < tempStu.length - 1; i++) {
            for (int j = 0; j < tempStu.length - i - 1; j++) {
                if (tempStu[j].score > tempStu[j+1].score) { //此处两个变量均为j!!!!!!!!!!!1
                    {
                        temp = tempStu[j+1];
                        tempStu[j+1] = tempStu[j];
                        tempStu[j] = temp;
                    }
                }
            }
        }


    }

    public void out() {
        for (int i = 0; i < tempStu.length; i++) {
            System.out.println("学号" + tempStu[i].num + "班级" + tempStu[i].state + "成绩" + tempStu[i].score);
        }


    }
}
