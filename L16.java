import java.util.Scanner;
class L16{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the elements Of Array");
	int rollno[]=new int[5];
	for(int i=0;i<5;i++){
	int n =sc.nextInt();
	rollno[i]=n;	}
	System.out.print("Elements in Array are : ");
	for(int i=0;i<5;i++){
	System.out.print(rollno[i]+"  ");
	}
	}

}