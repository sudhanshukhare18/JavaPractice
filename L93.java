import java.util.Scanner;
class L93{
	int fact(int n){
	int fact=1;
	for(int i=n;i>=1;i--){
	fact=fact*i;
	}
	return fact;
	
	}
	public static void main(String args[]){
	L93 x=new L93();
	System.out.println(x.fact(5));
	}
}