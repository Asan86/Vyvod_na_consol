package Klassy;

public class Person {
    String name;
    int age;
    String golos;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
    void foo(){
        System.out.println();
    }
}
