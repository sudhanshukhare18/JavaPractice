import java.util.Scanner;
class L4{
	public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=0;
	int a=sc.nextInt();
	int m=0;
	a=m;
	int fact=1;
	int sum=0;
	while(a!=0){
	int r=a%10;
	for(int i=1;i<=r;i++){
	fact*=i;}
	sum=sum+fact;
	a=a/10;
}if(sum==m){
System.out.println("This is strong number");
}else{
	System.out.println("This is not strong number");

}}
}
	