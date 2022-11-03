package ExceptionHandling;

public class Accounts {
    public double accountBalance;

    public double withDraw(double withdrawAmount) {

        if (accountBalance > withdrawAmount) {
            accountBalance = accountBalance - withdrawAmount;
            return accountBalance;
        } else {

            throw new RuntimeException("Insufficient balance");
        }
    }
}