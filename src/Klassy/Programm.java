package Klassy;

public class Programm {
    public static void main(String[] args) {

        Person undef = new Person();
        undef.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person sam = new Person("Sam", 24);
        sam.displayInfo();




    }
}
