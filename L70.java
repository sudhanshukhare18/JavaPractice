import java.util.Scanner;
class L70{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int nums[]={10,220,3,050,5};
	int sum=0;
	for(int x:nums){
	sum=sum+x;
	}
	System.out.println("Sum : "+sum);
	System.out.println("Average : " +(sum/nums.length));
	}
}