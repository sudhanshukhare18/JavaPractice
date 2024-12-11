import java.util.Scanner;
class L78{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s="Welcome To Bhopal";
	String arr[]=s.split(" ");
	String r=String.join("|",arr);
	System.out.println(r);

}
}