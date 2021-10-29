package bank02;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    //存钱
    public void deposit(double amt){
        if (amt>0) {
            balance+=amt;
            System.out.println("成功存入"+amt+"现在余额为"+balance);

        }
    }

    //取钱
    public void withdraw(double amt){

        if(amt>balance){
            System.out.println("余额不足！");
        }  else{
            balance-=amt;
            System.out.println("成功取出"+amt);
        }
    }
}
