package project02;

import project02Utils.utils;

import java.sql.SQLOutput;

public class CustomerView {
    CustomerList customerList = new CustomerList(10);
    boolean flag = true;


    public void enterMainMenu() {
        System.out.println("------------客户信息管理软件-------------\n");
        System.out.println("\t\t1 添加客户");
        System.out.println("\t\t2 修改客户");
        System.out.println("\t\t3 删除客户");
        System.out.println("\t\t4 客户列表");
        System.out.println("\t\t5 退   出");

    }

    private void addNewCustomer() {
        Customer c1 = new Customer();
        System.out.println("姓名 ");
        c1.setName(utils.readString(4));
        System.out.println("性别");
        c1.setGender(utils.readChar());
        System.out.println("年龄");
        c1.setAge(utils.readInt());
        System.out.println("电话");
        c1.setPhone(utils.readString(11));
        System.out.println("邮箱");
        c1.setEmail(utils.readString(20));
        customerList.addCustomer(c1);
        System.out.println("添加完成！");

    }

    private void modifyCustomer() {
        Customer c2 = new Customer();
        int index;
        System.out.println("请选择要修改的客户编号：");
        index = utils.readInt();
        System.out.println("姓名" + customerList.getCustomer(index).getName());
        c2.setName(utils.readString(4));
        System.out.println("性别" + customerList.getCustomer(index).getGender());
        c2.setGender(utils.readChar());
        System.out.println("年龄" + customerList.getCustomer(index).getAge());
        c2.setAge(utils.readInt());
        System.out.println("电话" + customerList.getCustomer(index).getPhone());
        c2.setPhone(utils.readString(11));
        System.out.println("邮箱" + customerList.getCustomer(index).getEmail());
        c2.setEmail(utils.readString(20));
        customerList.replaceCustomer(index, c2);
        System.out.println("替换完成！！");


    }

    private void deleteCustomer() {
        System.out.println("请选择待删除的客户编号（-1退出）：");
        int index = utils.readInt();
        if (index == -1) {
            return;
        }
        System.out.println("确认是否删除！（Y/N）：");
        char ch = utils.readChar();
        if (ch == 'Y') {
            customerList.deleteCustomer(index);
        } else {
            return;
        }


    }

    private void listAllCustomers() {
        customerList.print(customerList.getAllCustomer());

    }

    private void exit() {
        System.out.println("确定退出？（Y/N）");
        char ch = utils.readChar();
        if (ch == 'Y') {
            this.flag = false;
        }
    }

    public void run() {

        while (flag == true) {
            this.enterMainMenu();
            System.out.println("请选择（1-5）：");
            int num = utils.readInt();
            switch (num) {
                case 1:
                    this.addNewCustomer();
                    break;
                case 2:
                    this.modifyCustomer();
                    break;
                case 3:
                    this.deleteCustomer();
                    break;
                case 4:
                    this.listAllCustomers();
                    break;
                case 5:
                    this.exit();
                    break;
                default:
                    this.enterMainMenu();


            }
        }


    }


}
