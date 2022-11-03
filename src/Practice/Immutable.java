package Practice;

import com.sun.jndi.cosnaming.IiopUrl;

final public class Immutable {
    private String name;
    private int age;
    private Address address;

    public Immutable(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address.Street,address.City,address.Hno);
    }

    public Address getAddress() {
        return new Address(address.Hno,address.City,address.Street);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Immutable(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
