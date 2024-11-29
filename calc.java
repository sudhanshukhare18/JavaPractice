import java.util.Scanner;
class Calc{
	public static void main(String args[]){
	int d;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number");
	int a = sc.nextInt();
	System.out.println("Enter Second  number");
	int b=sc.nextInt();
	System.out.println("Which Calculation do you want to perform = + - * %");
	char c = sc.nextLine().charAt(0);
	if(c=='+'){
	System.out.println("Addition is");
	d = a+b;
	}
	else if(c=='-'){
	System.out.println("Substraction is");
	d = a-b;
	}
	else if(c=='*'){
	System.out.println("Multipication is");
	d = a*b;
	}
	else if(c=='%'){
	System.out.println("Division is");
	d = a/b;
	}
	else{
	System.out.println("Print Valid");
}
}
}