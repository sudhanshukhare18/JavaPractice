import java.util.Scanner;
class L43{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String 1 : ");
	String s1=sc.nextLine();
	System.out.println("Enter String 2 : ");
	String s2=sc.nextLine();
	int x=s1.compareTo(s2);
	if(x>0){
	System.out.println(s1+"	Is Greater");
	}
	else if(x<0){
	System.out.println(s2+" Is Greater");
	}
	else{
	System.out.println(s1+" And " + s2+" are equal ");
}
}
}