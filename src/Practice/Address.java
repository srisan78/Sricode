package Practice;

public class Address {
    public String Hno;
    public String Street;
    public String City;

    public Address(String street, String city, String hno) {
    }

    public Address() {

    }

    public String getHno() {
        return Hno;
    }

    public void setHno(String hno) {
        Hno = hno;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
