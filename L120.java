import java.util.Scanner;
class L120{
	public static void main(String args[]){
	System.out.println("Hello...Hii");
	int a,b,c=0;
	a=10;	
	b=0;
	
	System.out.println("Before Excpetion " );
	try{
	c=a/b;
	}catch(ArithmeticException ae){
	System.out.println("Denominator should not be zero");
	}


	System.out.println(c);
	System.out.println("Hello...bye");
	System.out.println("After Exception");
	
}
}