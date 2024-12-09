import java.util.Scanner;
class L69{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	 String s="welcome";
	char arr[]=s.toCharArray();
	System.out.println("Using For Loop ");
	int i;
	for(i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}
	System.out.println("Using for Each Loop ");
	for(char x:arr){
	System.out.println(x);
	}
}	
}