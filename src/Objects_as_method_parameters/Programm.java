package Objects_as_method_parameters;

public class Programm {
    public static void main(String[] args) {

        Person kate = new Person("Kate");
        System.out.println(kate.getName());     // Kate
        changePerson(kate);
        System.out.println(kate.getName());     // Kate - изменения не произошло
        // kate хранит ссылку на старый объект
    }
    static void changePerson(Person p){
        p = new Person("Alice");    // p указывает на новый объект

    }
    static void changeName(Person p){
        p.setName("Alice");
        p.setName("Ann");
    }
}


