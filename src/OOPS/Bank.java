package OOPS;

public class Bank {
  public   String AccountNumber;
  public   String AccountName;
  public   String AccountType;
 public    double AccountBalance;


    public void Deposit(double DepositAmount) {

        AccountBalance=AccountBalance+DepositAmount;
    }
public void WithDraw(double withdrawAmount){

        AccountBalance=AccountBalance-withdrawAmount ;
    }
    public  void ShowBalance(String AccountNumber){

        System.out.println(this.AccountBalance);
    }
}
