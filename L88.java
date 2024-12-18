import java.util.Scanner;
class L88{
	void sum(){
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Ist Value");
	a=sc.nextInt();
	System.out.println("Enter 2nd Value");
	b=sc.nextInt();
	System.out.println("Sum is : "+(a+b));
	}

	public static void main(String args[]){ 
	L88 obj=new L88();
	obj.sum();
	}
}
