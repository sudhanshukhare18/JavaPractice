import java.util.Scanner;
class L21{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++){
	System.out.println("Enter element Index Of " + i );
	arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<arr.length;i++){
	sum+=arr[i];
	System.out.println("\nOdd Index Element are " + arr[i]);
	}
	System.out.println("\nSum of all element are " + sum);
}
	
}