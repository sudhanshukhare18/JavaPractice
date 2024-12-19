import java.util.Scanner;
class L90{
	void add(int a,int b){
	int c=a+b;
	System.out.println("Addition is : " +c);
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number 1");
	int n1=sc.nextInt();
	System.out.println("Enter number 2");
	int n2=sc.nextInt();
	L90 obj=new L90();
	obj.add(n1,n2);
}
}
	