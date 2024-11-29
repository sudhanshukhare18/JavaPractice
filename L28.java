import java.util.Scanner;
class L28{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[7];
	for(int i=0;i<arr.length;i++){
	arr[i]=sc.nextInt();
	}
	int max=arr[0];
	int max2=0;
	for(int i=1;i<arr.length;i++){
	if(max<arr[i]){
	max2=max;
	max=arr[i];
	}
	else if(max2<arr[i] && arr[i]!=max){
	max2=arr[i];
	}
	}
	System.out.println("First Largest Number is "+max);
	System.out.println("Second Largest Number is "+max2);




	for(int i=1;i<arr.length;i++){
	if(max>arr[i]){
	max2=max;
	max=arr[i];
	}
	else if(max2>arr[i] && arr[i]!=max){
	max2=arr[i];
	}
	}
	System.out.println("\nFirst Smallest Number is "+max);
	System.out.println("Second Smallest Number is "+max2);

}
}