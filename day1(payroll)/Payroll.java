public class Payroll {
    public static void main(String[] args) {
        Address myAddress = new Address("343 101ST", "Brooklyn", "11209");
        Person myPerson = new Person("Everett", 28, myAddress);

        System.out.println(myPerson);
    }
}
