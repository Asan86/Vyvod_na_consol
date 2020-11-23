package peregruz_metoda;

public class Program_3{
    public static void main(String[] args) {

        System.out.println(sum(1, 3));
        System.out.println(sum(5.3, 2.3));
        System.out.println(sum(5, 4, 7));

    }
    static int sum(int x, int y){
        return x + y;
    }
    static double sum(double x, double y){
        return x + y;
    }
    static int sum(int x, int y, int z){
        return x + y + z;
    }
}
