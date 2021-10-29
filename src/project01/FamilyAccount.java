package project01;

import java.util.Scanner;

public class FamilyAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Login login = new Login();
        Menu.showMenu();
        boolean flag=true;
        while (flag){
            int num = scan.nextInt();
            switch(num){
                case 1 : login.showTable();break;
                case 2 : login.in();break;
                case 3 : login.out();break;
                case 4 :flag=login.confirm();break;
                default:
                    System.out.println("输入错误，请重输:");

            }


        }


    }
}
