package OOPS;

public class StdDetails {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.AccountName = "Sridhar";
        b.AccountNumber = "1234";
        b.AccountBalance = 2000;
        b.AccountType = "Saving";

        b.ShowBalance("1234");
        b.Deposit(1000);

        b.ShowBalance("1234");
        b.WithDraw(500);
        b.ShowBalance("1234");
    }
}
