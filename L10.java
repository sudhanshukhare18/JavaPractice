import java.util.Scanner;
class L10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();//59
        int sum =0;
        int pro =1;
        while(a!=0){
            int r =a%10;//9
            sum = sum+r;
            a=a/10;//5
                
            }
            
            if(a%sum==0){
            System.out.println("Niven Number");
            }else{
                System.out.println("Not a Niven Number");
                
            }
            
        }
        
    }
