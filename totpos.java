
import java.util.Scanner;
class totpos {
    public static void main(String[] args) {
        int odd,even;
        odd = 0;
        even = 0;
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
            odd++;
        }else{
            even++;
        }
        if(a2>0){
            odd++;
        }else{
            even++;
        }
        if(a3>0){
            odd++;
        }else{
            even++;
        }
        if(a4>0){
            odd++;
        }else{
            even++;
        }
        if(a5>0){
            odd++;
        }else{
            even++;
        }
        
    System.out.println("NUMBER OF POSITIVE VALUE" + odd);
    System.out.println("NUMBER OF NEGATIVE VALUE" + even);
    
    }
}