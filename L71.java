import java.util.Scanner;
class L71{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s;
	String r="";
	System.out.println("Enter String");
	s=sc.nextLine();
	for(int i=0;i<s.length();i++){
	int x=s.charAt(i);
	if(x>='a' ||x<='z'){
	x=x-32;
	r=r+(char)x;
	System.out.println(r);
	}
	else{
	r=r+(char)x;
	System.out.println(r);
	}
}
}
}