import java.util.Scanner;
class L38{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any String");
	String str=sc.nextLine();
	for(int i=0;i<str.length();i++){
	char x =str.charAt(i);
	System.out.println(x);
}
}
}