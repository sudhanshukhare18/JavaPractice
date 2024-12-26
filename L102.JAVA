import java.util.Scanner;
class point{
	int x;
	int y;
public point(){
x=1;
y=1;
System.out.println("Defoult Cnstructor is Called");
}
public void showdata(){
System.out.println("X_CO"+x);
System.out.println("Y_CO"+y);
}
public static void main(String args[]){
	point p=new point();
	point p2=new point();
	point p3=new point();
	p.showdata();
	p2.showdata();
	p3.showdata();
	}

}