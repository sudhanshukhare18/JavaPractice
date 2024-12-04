import java.util.Scanner;
class L44{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s1="Soft";
	String s2="ware";
	String s3=s1.concat(s2);
	String s4="Software";
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s3.compareTo(s4)==0);
	}
}