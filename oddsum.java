
import java.util.Scanner;
class oddsum {
    public static void main(String[] args) {
        int sum;
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER ");
        int a1= sc.nextInt();
        System.out.print("ENTER SECOND NUMBER ");
        int a2 = sc.nextInt();
        System.out.print("ENTER THIRD NUMBER ");
        int a3 = sc.nextInt();
        System.out.print("ENTER FOURTH NUMBER ");
        int a4 = sc.nextInt();
        System.out.print("ENTER FIFTH NUMBER ");
        int a5 = sc.nextInt();
        
        
        if(a1%2!=0){
        
        sum = sum+a1;
        }
        if(a2%2!=0){
        
        sum = sum+a2;
        }
        if(a3%2!=0){
        
        sum = sum+a3;
        }
        if(a4%2!=0){
        
        sum = sum+a4;
        }
        if(a5%2!=0){
        
        sum = sum+a5;
        }
     System.out.println("THE SUM OF ODD NUMBER IS " + sum);
    
    }
}