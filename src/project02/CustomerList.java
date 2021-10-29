package project02;

public class CustomerList {
    private Customer[] customers;
    private int total;
    public CustomerList(int totalCustomer){
        this.customers = new Customer[totalCustomer];

    }

    public boolean addCustomer(Customer customer){
        customers[total++]=customer;
        return true;
    }

    public boolean replaceCustomer(int index,Customer customer){
        if(index>total||index<0){
            return false;
        }
        customers[index] = customer;
        return true;
    }

    public boolean deleteCustomer(int index){
        for (int i = index; i <total; i++) {    //数组长度用total来表示！！！！！！！！
            customers[i] = customers[i+1];
        }
        customers[total--]=null;
        System.out.println("删除成功！");
        return true;
    }
    public Customer[] getAllCustomer(){
        return this.customers;
    }

    public Customer getCustomer(int index){
        return this.customers[index];
    }
    public int getTotal(){
        return total;
    }

    public void print(Customer[] cust){
        for (int i = 0; i <total; i++) {
            System.out.println("姓名:"+cust[i].getName()+"\n"+"性别:"+cust[i].getGender()+"\n"+"年龄:"+cust[i].getAge()+"\n"+"电话:"+cust[i].getPhone()+"\n"+"邮箱"+cust[i].getEmail());
        }
    }

//    public static void main(String[] args) {
//        CustomerList customerList = new CustomerList(10);
//        customerList.addCustomer(new Customer("一一",'男',20,"15253953734","123@qq.com"));
//        customerList.addCustomer(new Customer("二二",'男',21,"15253953734","123@qq.com"));
//        customerList.addCustomer(new Customer("三三",'女',22,"15253953734","123@qq.com"));
//        Customer c1 = new Customer();
//              c1=  customerList.getCustomer(1);
//        c1.out();
//        Customer[] cust2 = new Customer[10];
//        cust2 = customerList.getAllCustomer();
//        cust2[0].out();
//        customerList.print(customerList.getAllCustomer());
//        System.out.println("-------------------------");
//        customerList.getCustomer(0).out();
//        customerList.deleteCustomer(0);
//        customerList.print(customerList.getAllCustomer());
//    }
}
