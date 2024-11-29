
import java.util.Scanner;
class divi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int A,B;
     System.out.println("ENTER Numerator");
     A=sc.nextInt();
      System.out.println("Enter Denominator");
     B=sc.nextInt();
     int QUO = A/B;
     int REM = A%B;
      System.out.println("Quotient is : " + QUO);
      System.out.println("Remainder is : " + REM);
        
    }
}