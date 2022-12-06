package ie.atu.week11.MoreInheritance;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person("Dave", "H65", "123456");
        System.out.println(person.toString());

        Customer Peter = new Customer("Peter", "H95", "09876", "1122", true);
        System.out.println(Peter.toString());

        Customer Part1 = new Customer("Tyler","H75","99877","7532",false);
        System.out.println(Part1.toString());


    }
}
