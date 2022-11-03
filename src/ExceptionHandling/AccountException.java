package ExceptionHandling;

public class AccountException {
    public static void main(String[] args) {
        Accounts a=new Accounts();
a.accountBalance=120000;
a.withDraw(120000);
    }
}
