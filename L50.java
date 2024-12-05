import java.util.Scanner;
class L50{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s1=new String("Bhopal");
	String s2="Bhopal";
	String s3=s1;	
	System.out.println(s1==s3);
	System.out.println(s1.equals(s2));
	}
}
