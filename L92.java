import java.util.Scanner;
class L92{
	int add(int a,int b){
	int c=a+b;
	return c;
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter number 1 : ");
	int n1=sc.nextInt();
	System.out.print("Enter number 2 : ");
	int n2=sc.nextInt();
	L92 obj=new L92();
	int r=obj.add(n1,n2);
	System.out.println("Addition is : "+r);
}
}
	