
import java.util.Scanner;
class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number between 1 to 12 to get the month name : ");
        int a = sc.nextInt();
        if(a==1){
            System.out.println("THE MONTH IS JANUARY");
        }
        else if(a==2){
            System.out.println("THE MONTH IS FEBRUARY");
        }
         else if(a==3){
            System.out.println("THE MONTH IS MARCH");
        }
         else if(a==4){
            System.out.println("THE MONTH IS APRIL");
        }
         else if(a==5){
            System.out.println("THE MONTH IS MAY");
        }
         else if(a==6){
            System.out.println("THE MONTH IS JUNE");
        }
         else if(a==7){
            System.out.println("THE MONTH IS JULY");
        }
         else if(a==8){
            System.out.println("THE MONTH IS AUGUST");
        }
         else if(a==9){
            System.out.println("THE MONTH IS SEPTEMBER");
        }
         else if(a==10){
            System.out.println("THE MONTH IS OCTOBER");
        }
         else if(a==11){
            System.out.println("THE MONTH IS NOVEMBER");
        }
         else if(a==12){
            System.out.println("THE MONTH IS DECEMBER");
        } else{
            System.out.println("ENTER VALID MONTH NUMBER");
        }
        
    
    }
}