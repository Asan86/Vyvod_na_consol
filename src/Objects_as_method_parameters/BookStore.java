package Objects_as_method_parameters;

public class BookStore {
    public static void main(String[] args) {
        Book book = new Book("война и мир");
        reed(book);
        System.out.println(book.getName());
        int n = 10;
        reed(n);
        System.out.println(n);

    }
    private static void reed(Book b){
        b.setName("неизвестная книга");
    }
    private static void reed(int x){
        x = 20;
    }
}
