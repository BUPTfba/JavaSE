package bank02;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers =new Customer[10];
    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        customers[numberOfCustomers] = customer;
        numberOfCustomers++;

    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index > numberOfCustomers || index < 0) {
            System.out.println("该位置没有客户");
            return null;
        } else {
            return customers[index];

        }
    }


}



