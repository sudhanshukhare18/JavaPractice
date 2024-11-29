import java.util.Scanner;
class L8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
	int p=a;
        int sum =0;
        int pro =1;
        while(p!=0){
            int r =p%10;
            sum=sum + r;
            pro = pro*r;
            p=p/10;
            }
            int b=sum+pro;
            if(b==a){
            System.out.println("Special two digit number");
            }
	else{
             System.out.println("Not a special two-digit number");
                
            }
            
        }
        
    }
