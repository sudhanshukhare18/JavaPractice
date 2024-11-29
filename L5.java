import java.util.Scanner;
class L5{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int res=0;
	while(a!=0){
	int r=a%10;
	res =res*10+r;
	a=a/10;
}
	System.out.println(res);

	if(a==res){
	System.out.println("This is Palindrome Number");
	}
	else{
	System.out.println("This is not Palindrome number");
}
}
}
	