import java.util.Scanner;
class L19{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter size Of Array");
	int a =sc.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++){
	arr[i]=sc.nextInt();
	}
	for(int i=0;i<a;i++){
	System.out.println("THE ARRAY ON INDEX " + i + " IS " + arr[i]);
	}
}
	
}