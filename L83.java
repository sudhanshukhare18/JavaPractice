import java.util.Scanner;
class L83{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String arr=sc.nextLine();
	
	StringBuffer s=new StringBuffer(arr);
	for(int i=0;i<arr.length();i++){
	char a=s.charAt(i);
	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
	s.setCharAt(i,'Z');
	}
	}
	System.out.println(s);
	}
}