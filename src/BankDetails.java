
public class BankDetails {
    public static void main(String[] args) {
        Bank b1 = getBank("SBI", "313345", 10000);
        Bank b2 = getBank("HDFC", "3133565", 70000);

        showBalance(b1);
        test(b2.Name);
        test("sri");
        test("helo");
        System.out.println("Bank Name:"+b1.Name);
        System.out.println( "Account Number:" +b1.accountNumber);
        System.out.println("Balance:"+ b1.accountBalance);
        System.out.println("Bank Name:"+ b2.Name);
        System.out.println( "Account Number:"+b2.accountNumber);
        System.out.println( "Balance:"+b2.accountBalance);


    }

    public static Bank getBank(String Name, String accountNumber, double accountBalance) {
        Bank b = new Bank();
        b.Name = Name;
        b.accountNumber = accountNumber;
        b.accountBalance = accountBalance;
        return b;

    }

    private static void showBalance(Bank Bank) {
        System.out.println("account Number:" + Bank.accountNumber + "has" + "rs." + Bank.accountBalance);
    }

    public static void test(String a) {
        System.out.println("power");
        Demo(a);
    }

    private static void Demo(String a) {
        System.out.println("Star");
        Sample(a);
    }

    private static void Sample(String a) {
        System.out.println("hello");
        System.out.println(a);
    }
}
