package abstractClass;

public class Program {
    public static void main(String[] args) {
//        Employee sam = new Employee("Sam", "Lemon Brothers");
//        sam.display();
//        Client bob = new Client("Bob", "Lemon Brothers");
//        bob.display();

        Rectangl rectangl = new Rectangl(6, 6, 8, 8);

        System.out.println(rectangl.getArea());
        System.out.println(rectangl.getPerimeter());
    }
}
