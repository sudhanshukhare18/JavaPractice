import java.util.Scanner;
class employee{
String empname;
int empno;
float sal;
void acceptdata(){
	System.out.println("Enter Your Name");
	Scanner sc=new Scanner(System.in);
	empname=sc.nextLine();
	System.out.println("Enter Emplooye Code");
	empno=sc.nextInt();
	System.out.println("Enter Your Basic Salary");
	sal=sc.nextFloat();
}
void showdata(){
	System.out.println("Employee Name : "+empname);
	System.out.println("Employee Code : "+empno);
	System.out.println("Employee Salary : "+sal);
	
}
double hra(){
	double s=sal*0.2f;
	return s;
}
double da(){
	double d=sal*0.2f;
	return d;
}
double ta(){
	double t=sal*0.1f;
	return t;
}
double gross(){
	double g=sal+hra()+da()+ta();
	return 0;
}
double in(){
	double i=hra()+da()+ta();
	return i;
}
public static void main(String args[]){
	employee e=new employee();
	e.acceptdata();
	e.showdata();
	System.out.println("HRA "+ e.hra());
	System.out.println("DA "+ e.da());
	System.out.println("TA "+ e.ta());
	System.out.println("TOTAL Incentive "+ e.in());
	System.out.println("Gross Salary "+ e.gross());
}
}