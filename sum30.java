
import java.util.Scanner;
class sum30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a,b,c;
         System.out.println("enter first number");
         a = sc.nextInt();
         System.out.println("enter second number");
         b = sc.nextInt();
         c=a+b;
         if(a==30 ||b==30){
             System.out.println("TRUE");
         }
         else if(c==30){
             System.out.println("TRUE");
         }
         else{
             System.out.println("FALSE");
         
         }
    
        
    }
}