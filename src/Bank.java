
public class Bank {
    public String Name;
    public String accountNumber;
    public double accountBalance;

    public  void withDraw(double amount){

        accountBalance=accountBalance-amount;
    }
    public void deposit(double amount){

        accountBalance=accountBalance+amount;
    }
}
