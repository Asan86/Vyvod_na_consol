package metod_;

public class DeyTime {
    public static void main(String[] args) {

//        System.out.println(dayTime(7));
//        System.out.println(dayTime(13));
//        System.out.println(dayTime(18));
//        System.out.println(dayTime(2));

        dayTime(7);
        dayTime(13);
        dayTime(32);
        dayTime(56);


    }
//    static  String dayTime(int hour){
//        if (hour > 24 || hour < 0)
//            return "Неверные данные";
//        else if (hour > 21 || hour < 6)
//            return "Спокойной ночи";
//        else if (hour >= 15)
//            return "Добрый вечер";
//        else if (hour >= 11)
//            return "Добрый день";
//        else
//            return "Доброе утро";
//    }

    static  void dayTime(int hour){
        if (hour > 24 || hour < 0)
            return;
        else if (hour > 21 || hour < 6)
            System.out.println("Спокойной ночи");
        else if (hour >= 15)
            System.out.println("Добрый вечер");
        else if (hour >= 11)
            System.out.println("Добрый день");
        else
            System.out.println("Доброе утро");
    }
}
