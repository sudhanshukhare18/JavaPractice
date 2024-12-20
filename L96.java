import java.util.Scanner;
class L96{
	void fact(int n){
	
	if(n<0){
	int r=n%10;
	int sum=0;
	sum=sum*10+r;
	n=n/10;
	fact(n);
	System.out.println(sum);
	}
	 
	}
	public static void main(String args[]){
	L93 x=new L93();
	x.fact(121);
	}
}