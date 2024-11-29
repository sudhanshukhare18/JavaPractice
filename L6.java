import java.util.Scanner;
class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int sum =0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum=sum+i;
                
            }
        }
	if(a>sum){
        System.out.println(sum+" > "+a+" so "+a+" is an Abundant number.");
}
	else{
	 System.out.println("Not Abundant");
    }
}