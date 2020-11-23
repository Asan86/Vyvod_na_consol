package interfase;

 interface Printable {
     default void print() {}

     static void read(){
         System.out.println("Read printable");
         System.out.println("Read printable");
     }
 }
