package Practice;

public class Main {
    public static void main(String[] args) {
//       Immutable m=new Immutable("sri",);
//        System.out.println("Name:"+m.getName());
//        System.out.println("age:"+m.getAge());
//    System.out.println(m.getAddress());
Address address =new Address();
address.City="banglore";
address.Hno="12";
address.Street="aaa";
        Immutable m=new Immutable("sri",25,address );
        Address address1=m.getAddress();
        address1.setCity("bagalur");
        System.out.println(m.getAddress().City);
    }
}
