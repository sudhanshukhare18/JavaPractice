import java.util.Scanner;
class L89{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int sum=a;
	boolean isPlus=false;
	if(b==1){
	isPlus=false;
	}
	else{
	isPlus=true;
	}
	for(int i=a-1;i>=1;i--){
	if(isPlus){
	sum=sum+i;
	isPlus=false;
	}
	else{
	sum=sum-i;
	isPlus=true;
	}
	}
	System.out.println(sum);
}
}