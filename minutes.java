
import java.util.Scanner;
class minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int hr,min;
     System.out.println("Enter Hours");
     hr=sc.nextInt();
      System.out.println("Enter Minutes");
     min=sc.nextInt();
     hr = hr*60;
     min = min+hr;
      System.out.println("TOTAL MINUTES ARE" + min);
        
    }
}