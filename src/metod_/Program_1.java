package metod_;

public class Program_1 {
    public static void main(String[] args) {

        int x = sum(3, 4, 5);
        int y = sum(1, 5, 9);
        System.out.println(x);
        System.out.println(y);

    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
}
