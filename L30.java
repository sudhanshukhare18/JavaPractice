import java.util.Scanner;
class L30{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int c=0;
	int arr[][]=new int[2][5];
	System.out.println("Input The elements");
	for(int i=0;i<arr.length;i++){
	for(int j=0;j<arr[i].length;j++){
	arr[i][j]=sc.nextInt();
	}
}
	System.out.println("\nOutput Of 2D array");
	for(int i=0;i<2;i++){
	for(int j=0;j<5;j++){
	System.out.print("\t"+arr[i][j]);
}
System.out.println();
}

}
}
	