import java.util.Scanner;
class student{
String name,Enrol;
int p,c,m,h,a;
	void getdata(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name : ");
	name=sc.nextLine();
	System.out.println("Enrollment Number : ");
	Enrol=sc.nextLine();
	System.out.println("Physics Marks : ");
	p=sc.nextInt();
	System.out.println("Chemistry Marks : ");
	c=sc.nextInt();
	System.out.println("Mathsmatics Marks : ");
	m=sc.nextInt();
	System.out.println("History Marks : ");
	h=sc.nextInt();
	System.out.println("Art Marks : ");
	a=sc.nextInt();
	}
	void showdata(){
	System.out.println("Name is :"+name);
	System.out.println("Enrollment is :"+Enrol);
	System.out.println("Physics marks are :"+p);
	System.out.println("MATHS marks are :"+m);
	System.out.println("Chemistry marks are :"+c);
	System.out.println("History marks are :"+h);
	System.out.println("Art marks are :"+a);
	}
	int tot(){
	int sum=p+c+m+h+a;
	return sum;
	}
	float per(int tot){
	float pr=tot/5;
	return pr;
	}
public static void main(String args[]){
	student n=new student();
	n.getdata();
	n.showdata();
	int tm=n.tot();
	System.out.println("Total marks :"+tm);
	float p=n.per(tm);
	System.out.println("Percentage :"+p);
	
}
}