package inheritance;

public class DriveClass {
    public static void main(String[] args) {
        Bank b=new Bank(1,"sbi","banglore","sbi999");
        System.out.println(b.getBranch());
        Bank Sbi=new SbiBank(2,"bagalur","30483");
        System.out.println(Sbi.getName());

        System.out.println(Sbi.getIfsc());
    }
}
