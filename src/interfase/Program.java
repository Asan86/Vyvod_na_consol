package interfase;

public class Program {
    public static void main(String[] args) {
//        Book book1 = new Book("Java. Complete Referense.", "H. Shildt");
//        book1.print();

//        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
//        printable.print();
//
//        Printable printable1 = new Jornal("Foreign Policy");
//        printable1.print();

        Printable.read();

        Printable p = new Jornal("Foreign Affairs");
        p.print();

        String name = ((Jornal)p).getName();

    }

}
