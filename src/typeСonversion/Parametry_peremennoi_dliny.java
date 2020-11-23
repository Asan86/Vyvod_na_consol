package typeСonversion;

public class Parametry_peremennoi_dliny {
    public static void main(String[] args) {
        sum("jjj",1, 3, 3);
        sum("ddd",1,2,3,4,5);
        sum( "s");
        sum("ttt");
    }
    static void sum(String s, int ...nums){
        int result = 1;
        for (int n: nums)
            result += n;
        System.out.println(s + " - " + result);
    }
}
