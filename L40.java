import java.util.Scanner;
class L40{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any String");
	String str=sc.nextLine();
	for(int i=str.length()-1;i>=0;i--){
	char x =str.charAt(i);
	System.out.println(x);
}
}
}