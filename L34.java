import java.util.Scanner;
class L34{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int c=0;
	int arr[][]=new int[3][3];
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		arr[i][j]=sc.nextInt();
		
		}
	}
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		c=c+arr[i][j];
		System.out.print("\t"+arr[i][j]);
		}
	System.out.println("\t"+c);
	c=0;
	}
	c=0;
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		c=c+arr[j][i];
		}
		
		System.out.print(" "+"\t"+c);
		c=0;
		}
 
}
}