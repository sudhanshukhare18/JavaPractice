import java.util.Scanner;
class L11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int  t1,t2,t3;
	t1=0;
	t2=1;
	System.out.print("\t" + t1 + "\t" + t2);
	for(int i=3 ;i<=a;i++){
	t3=t1+t2;
	System.out.print("\t"+t3);
	t1=t2;
	t2=t3;
	}
	
}
}