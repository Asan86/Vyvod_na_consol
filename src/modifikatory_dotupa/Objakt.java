package modifikatory_dotupa;

public class Objakt {
    public static void main(String[] args) {

        Person person1 = new Person("Tom", 24);

        Cat cat1 = new Cat("Murka", 1);


        System.out.println("My name is " + person1.getName() + ", my cat,s name is Murka");
        person1.setName("Tom");
        person1.setAge(34);
        System.out.println("I,m " + person1.getAge() + " years old");


        cat1.setName("Murka");
        System.out.println(cat1.getName());

        cat1.setAge(1);
        System.out.println(cat1.getAge());


    }
}
