import java.util.Scanner;
class cir{
float r;
	void accept(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius : ");
	r=sc.nextFloat();
	}
	void showdata(){
	System.out.println("Radius is : "+r);
	}
	void getarea(){
	System.out.println("Area is : "+(3.14*r*r));
	}
	void circ(){
	System.out.println("Circumfrence is : "+(2*3.14*r));
	}
	public static void main(String args[]){
	cir n=new cir();
	n.accept();
	n.showdata();
	n.getarea();
	n.circ();
	}
}