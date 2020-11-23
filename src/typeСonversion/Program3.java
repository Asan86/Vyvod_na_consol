package typeСonversion;

public class Program3 {
    public static void main(String[] args) {
        Person tom = new Person("Asan");
        tom.display();

        Person sam = new Employee("Asan", "Oracle");
        sam.display();

        Person kate = new Client("Kate", "DeutscheBank", 22);

        Person bob = new Client("Bob", "DeutscheBank", 3000);
        bob.display();

        Person elise = new Employee("Alise", "Google");
    }
}
