import java.util.Scanner;
class point{
	int x;
	int y;
public point(int a,int b){
x=a;
y=b;
System.out.println("Defoult Cnstructor is Called");
}
public void showdata(){
System.out.println("X_CO"+x);
System.out.println("Y_CO"+y);
}
public static void main(String args[]){
	point p=new point(121,130);
	point p2=new point(11,22);
	point p3=new point(45,18);
	p.showdata();
	p2.showdata();
	p3.showdata();
	}

}