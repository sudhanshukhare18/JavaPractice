import java.util.Scanner;
class L82{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String arr=sc.nextLine();
	char a[]=arr.toCharArray();
	StringBuffer s=new StringBuffer(arr);
	for(int i=0;i<a.length;i++){
	if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
	s.setCharAt(i,'Z');
	}
	}
	System.out.println(s);
	}
}