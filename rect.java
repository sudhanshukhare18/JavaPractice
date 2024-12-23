import java.util.Scanner;
class rect{
int l;
int b;
	void accept(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Length : ");
	l=sc.nextInt();
	System.out.println("Enter Breadth : ");
	b=sc.nextInt();
	}
	void showdata(){
	System.out.println("Length is : "+l);
	System.out.println("breadth is : "+b);
	}
	void getarea(){
	System.out.println("Area is : "+l*b);
	}
	void peri(){
	System.out.println("Perimeter is : "+2*(l+b));
	}
public static void main(String args[]){
	rect n=new rect();
	n.accept();
	n.showdata();
	n.getarea();
	n.peri();
}
}