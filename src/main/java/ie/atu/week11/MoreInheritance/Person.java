package ie.atu.week11.MoreInheritance;

public class Person {

    private String name;
    private String address;
    private String tele;

    public Person() {
    }

    public Person(String name, String address, String tele){
        this.name=name;
        this.address=address;
        this.tele=tele;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String toString(){
        return "name " + name + '\'' +
                "address " + address + '\'' +
                "tele " + tele + '\'';
    }
}
