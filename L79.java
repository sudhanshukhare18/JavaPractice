import java.util.Scanner;
class L79{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s="Welcome To Bhopal";
	String arr[]=s.split(" ");
	String r="";
	for(int i=0;i<3;i++){
	r+=String.join("|",arr);
	}
	System.out.println(r);

}
}