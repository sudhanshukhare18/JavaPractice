
import java.util.Scanner;
class avgpos {
    public static void main(String[] args) {
        int pos,neg,sum;
        pos = 0;
        neg = 0;
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
        
        
        if(a1>0){
        pos++;
        sum = sum+a1;
        }else{
            neg++;
        }
        if(a2>0){
            pos++;
            sum = sum+a2;
        }else{
            neg++;
        }
        if(a3>0){
            pos++;
            sum = sum+a3;
        }else{
            neg++;
        }
        if(a4>0){
            pos++;
            sum = sum+a4;
        }else{
            neg++;
        }
        if(a5>0){
            pos++;
            sum = sum+a5;
        }else{
            neg++;
        }
        
    System.out.println("NUMBER OF POSITIVE VALUE " + pos);
    int avg = sum/pos;
     System.out.println("THE AVERAGE IS " + avg);
    
    }
}