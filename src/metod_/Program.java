package metod_;

public class Program {
    public static void main(String[] args) {

        double d = 2.3, b = 6.4;


        sum(d, b);
        sum(2.3, 6.4);
        sum(b, 34);
        sum(b, 12);

        display("Marat", 23);
    }
    static void sum(double x, double y){
        double z = x + y;
        System.out.println(z);
    }

    static void display(String name, int age){

        System.out.println("Меня зовут " + name + " мне " + age + " года");
    }
}

