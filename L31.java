import java.util.Scanner;
class L31{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int c=0;
	int a[][]=new int[3][3];
	a[0][0]=10;
	a[0][1]=20;
	a[0][2]=30;

	a[1][0]=40;
	a[1][1]=50;
	a[1][2]=60;
	a[2][0]=70;
	a[2][1]=80;
	a[2][2]=90;

System.out.println(a[0][0]+"\t"+a[0][1]+"\t"+a[0][2]);
System.out.println(a[1][0]+"\t"+a[1][1]+"\t"+a[1][2]);
System.out.println(a[2][0]+"\t"+a[2][1]+"\t"+a[2][2]);
}
}