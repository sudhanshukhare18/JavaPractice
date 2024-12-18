//Example: Taking Nothing and Returning Nothing
import java.util.Scanner;
class A1{
	
	public void add(){
	//step1: Declare Variable
	int a,b,c;
	//step2: Input
	System.out.println("=======> Add Function is Called<=========");
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter Value of A : ");
	a=kb.nextInt();
	System.out.println("Enter Value of B : ");
	b=kb.nextInt();

	//Step3: Perform Operation
	c=a+b;
	//step4: Print Result
	System.out.println("Addition : "+c);
		

	}
	public static void main(String args[]){
	A1 obj=new A1();
	//How to access method of class
	//objectName.methodName()

	obj.add();
	obj.add();
	obj.add();
	obj.add();
	obj.add();


	}

}