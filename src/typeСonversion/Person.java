package typeСonversion;

public class Person {
    private String name;

    protected String getName(){
        return name;
    }
    public Person(String name){
        this.name = name;
    }
    public void display(){
        System.out.printf("Person %s \n", name);
    }
}
class Employee extends Person{
    private String company;

    Employee(String name, String company){
        super(name);
        this.company = company;
    }
    public String getCompany(){
        return company;
    }
    @Override
    public void display(){
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}
class Client extends Person{
    private int sum;
    String bank;

    public int getSum() {
        return sum;
    }

    public String getBank() {
        return bank;
    }

    Client(String name, String bank, int sum) {
        super(name);
        this.bank = bank;
        this.sum = sum;
    }
    @Override
    public void display(){
        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }
}
