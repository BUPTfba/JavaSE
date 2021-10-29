package bank;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(){

    }
    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //取钱
    public void withdraw(double ammount){
      if(ammount>balance){
          System.out.println("余额不足！");
      }  else{
          balance-=ammount;
          System.out.println("成功取出"+ammount);
      }
    }
    //存钱
    public void deposit(double ammount){
        if (ammount>0) {
            balance+=ammount;
            System.out.println("成功存入"+ammount);

        }

    }
}
