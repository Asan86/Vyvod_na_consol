package static_;

public class Person {
    private int id;
    private static int counter = 1;

    Person() {
       id = counter++;

    }
    public static void displayCounter(){
        System.out.printf("Id: %d \n", counter);
    }
    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }
}
