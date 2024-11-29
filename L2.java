import java.util.Scanner;
class L2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int sum=0;
	System.out.print("Enter Any Number : ");
	int a =sc.nextInt(); 
	for(int i=1;i<a;i++){
		if(a%i==0){
		sum = sum+i;
		}
		}
		if(a==sum){
		System.out.println("This is a perfect number");
		}
		else{
		System.out.println("This is not a perfect number");
}
}
}
		