import java.util.Scanner;
class L32{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[2][5];
	for(int i=0;i<a.length;i++){
	for(int j=0;j<a[i].length;j++){
	a[i][j]=sc.nextInt();
	}
}
	for(int i=0;i<a.length;i++){
	for(int j=0;j<a[i].length;j++){
	System.out.print("\t"+a[i][j]);
}
	System.out.println();
}
}
}