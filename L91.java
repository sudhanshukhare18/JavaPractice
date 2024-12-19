import java.util.Scanner;
class L91{
	int add(){
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number 1");
	int b=sc.nextInt();
	System.out.println("Enter number 2");
	int a=sc.nextInt();
	int c=a+b;
	return c;
	}


	public static void main(String args[]){
	L91 obj=new L91();
	int r=obj.add();
	System.out.println("Addition is : "+r);
}
}
	