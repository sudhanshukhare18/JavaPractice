import java.util.Scanner;
class L94{
	int fact(int n){
	if(n==1){
	return 1;
	}
	else{
	return n*fact(n-1);
	}
	
	}
	public static void main(String args[]){
	L93 x=new L93();
	System.out.println(x.fact(5));
	}
}