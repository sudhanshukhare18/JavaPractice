import java.util.*;
class multiplied {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST VALUE");
      int a = sc.nextInt();
      System.out.println("ENTER SECOND VALUE");
      int b = sc.nextInt();
      if (a%b==0){
          System.out.println("multiplied");
      }
      else{
          System.out.println("Not multiplied");
      }
    }
}