import java.util.Scanner;
class L1{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	int b=1;
	System.out.print("Enter any number : ");
	int a=sc.nextInt();
	for(int i=1;i<=a;i++){
	b = b*i;}
	System.out.println("Factorial of a given number : " + b);
	
}	
}

	