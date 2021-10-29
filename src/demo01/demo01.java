package demo01;

public class demo01 {
    public static void main(String[] args) {
        System.out.println("hello word!");
        System.out.println("hello word!");
        System.out.println("hello word!");

        for(int i=1;i<10;i++){
            if(i%3==0) continue;
            System.out.println(i);
        }
        for(int i=1;i<10;i++){
            if(i%3==0) break;
            System.out.println(i);
        }
    }
}
/**
 * Java中的名称命名规范
 * Java中的名称命名规范:
 * ➢包名:多单词组成时所有字母都小写: xxxyyyzzz
 * ➢类名、接口名:多单词组成时，所有单词的首字母大写: XxxYyyZzz
 * ➢变量名、方法名:多单词组成时，第- 一个单词首字母小写，第二个单词开始每个单词首字母大写: xxxYyyZzz ，
 * ➢常量名:所有字母都大写。多单词时每个单词用下划线连接: XXX_ _YYY_ ZZZ
 */