import java.util.Scanner;
class L3{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter any number : ");
	int n=sc.nextInt();
	int sum=0;
	while(n!=0){
	int r=n%10;
	if(r%2==0){
	sum=sum+r;}
	n=n/10;
}
	System.out.println("The Number of Digit are  : "+sum);
}
}