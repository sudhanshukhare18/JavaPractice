
import java.util.Scanner;
class speed {
    public static void main(String[] args) {
        float km;
        Scanner sc = new Scanner(System.in);
         System.out.println("ENTER SPEED IN KM/H");
        km = sc.nextFloat();
        double m = km*0.62137;
    
        System.out.println("SPEED IN MILES PER HOURS IS " + m);
    }
}