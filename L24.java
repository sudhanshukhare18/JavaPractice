import java.util.Scanner;
class L24{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int arr[]=new int[10];
	int i=0;
	
	while(n>0){
	int r=n%2;
	arr[i]=r;
	i++;
	n=n/2;
}
	for(i=i-1;i>=0;i--){
	System.out.print(arr[i]);}
	
}
}