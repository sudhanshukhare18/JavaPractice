import java.util.Scanner;
class ex2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choise ");
	System.out.println("Press  + for addition ");
	System.out.println("Press  * for multipication ");
	System.out.println("Press  - for Substraction ");
	System.out.println("Press  % for Division ");
	int d,x,y;
	char a;
	a =sc.next().charAt(0);
	System.out.println("Enter first number ");
	x=sc.nextInt();
	System.out.println("Enter second number ");
	y=sc.nextInt();

	switch(a){
	case '+':
	d = x+y;
	System.out.println("Addition is " + d);
	break;
	case '*':
	d = x*y;
	System.out.println("Multipication is " + d);
	break;
	case '-':
	d = x-y;
	System.out.println("Substraction is " + d);
	break;
	case '%':
	d = x/y;
	System.out.println("Division is " + d);
	break;
	default:
	System.out.println("Enter correct operator");
}
}
}
