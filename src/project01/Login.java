package project01;

import java.util.Scanner;

public class Login {
     int balance = 1000;
     Scanner scan = new Scanner(System.in);
     String items="";
    /**
     * 输出相关信息
     */
     String details="";
     int exchanges;
    public void showTable(){
        System.out.println("------当前收支明细记录---------");
        System.out.println("收支\t账户金额\t\t收支金额\t\t说明");
        System.out.println(items);
        Menu.showMenu();
    }
    public void in(){
        System.out.println("本次收入金额：");
        exchanges = scan.nextInt();
        balance+=exchanges;
        System.out.println("本次收入明细：");
        details = scan.next();
        items+="收入\t"+balance+"\t\t"+exchanges+"\t\t"+details+"\n";
        System.out.println("登记完成！");
        Menu.showMenu();
    }
    public void out(){
        System.out.println("本次支出金额：");
        exchanges = scan.nextInt();
        balance-=exchanges;
        System.out.println("本次支出明细：");
        details = scan.next();
        items+="支出\t"+balance+"\t\t"+exchanges+"\t\t"+details+"\n";
        System.out.println("登记完成！");
        Menu.showMenu();
    }
    public boolean confirm(){
        System.out.println("确定退出？（Y：1/N：0）");
        int i = scan.nextInt();
        if(i==1){
            return false;
        }else {
            Menu.showMenu();
            return true;
        }


    }

}
