import java.util.Scanner;
class banknotes{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		int a=sc.nextInt();
		int r,n;
		n=a/100;
		System.out.println("The notes of 100 are : " + n);
		r=a-(n*100);
		n=r/50;
		System.out.println("The notes of 50 are : " + n);
		r=r-n*50;
		n=r/20;
		System.out.println("The notes of 20 are : " + n);
		r=r-n*20;
		n=r/10;
		System.out.println("The notes of 10 are " + n);
		r=r-n*10;
		n=r/5;
		System.out.println("The notes of 5 are : " + n);
		r=r-n*5;
		n=r/2;
		System.out.println("The notes of 2 are : " + n);
		r=r-n*2;
		n=r/1;
		System.out.println("The notes of 1 are : " + n);
}
}