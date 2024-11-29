import java.util.Scanner;
class L7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();//1122
        int sum =0;
        int pro =1;
        while(a!=0){
            int r =a%10;//2
            sum=sum + r;
            pro = pro*r;
            a=a/10;//112
                
            }
            if(sum==pro){
            System.out.println("Spy Number");
            }else{
                System.out.println("Not Spy Number");
                
            }
            
        }
        
    }
