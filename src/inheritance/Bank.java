package inheritance;

public class Bank {
private int id;
private  String name;
private String Branch;
private String Ifsc;

    public Bank(int id, String name, String branch, String ifsc) {
        this(branch,ifsc);
        this.id = id;
        this.name = name;

    }

    public  Bank(String branch, String ifsc) {
       this.Branch = branch;
        this.Ifsc = ifsc;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {

        this.id = id;
    }

    public  String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getIfsc() {
        return Ifsc;
    }

    public void setIfsc(String ifsc) {
        Ifsc = ifsc;
    }
}
