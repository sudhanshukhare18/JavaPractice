import java.util.Scanner;
class L84{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	StringBuffer s=new StringBuffer(a);
	System.out.println(s);
	s.reverse();
	System.out.println(s);
	if(s.equalsTo(a)){
	System.out.println("pal");
	}
	else{
	System.out.println("Npal");
	}
	}
}