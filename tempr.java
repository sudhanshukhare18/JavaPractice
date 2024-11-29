
import java.util.Scanner;
class tempr {
    public static void main(String[] args) {
        float cen,fer;
        Scanner sc = new Scanner(System.in);
         System.out.println("ENTER THE TEMPRATURE IN CELCIUS");
        cen = sc.nextFloat();
        fer=(9*cen +(32*5))/5;
        System.out.println("THE TEMPRATURE IN FEHRENHEIT " + fer);
    }
}