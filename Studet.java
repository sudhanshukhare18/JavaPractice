import java.util.Scanner;
class Studet{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NAME");
		String name = sc.nextLine();
		System.out.println("ENTER ENROLLMENT");
		String enrollment = sc.nextLine();
		System.out.println("ENTER SECTION");
		String section = sc.nextLine();
		System.out.println("ENTER PHYSICS MARKS");
		int ph = sc.nextInt();
		System.out.println("ENTER CHEMISTRY MARKS");
		int ch = sc.nextInt();
		System.out.println("ENTER HINDI MARKS");
		int hi = sc.nextInt();
		System.out.println("ENTER ENGLISH MARKS");
		int e = sc.nextInt();
		System.out.println("ENTER MATHS MARKS");
		int m = sc.nextInt();
		int total =ph+ch+hi+e+m;
		float percentage = total/5.0f;
		System.out.println("MARKS OF PHYSICS ARE : " + ph);
		System.out.println("MARKS OF CHEMISTRY ARE : " + ch);
		System.out.println("MARKS OF HINDI ARE : " + hi);
		System.out.println("MARKS OF ENGLISH ARE : " + e);
		System.out.println("MARKS OF MATHS ARE : " + m );
		System.out.println("GRAND TOTAL IS : " + total);
		System.out.println("PERCENTAGE : " + percentage);
		
		}
	} 
