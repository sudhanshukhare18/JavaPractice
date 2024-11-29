import java.util.Scanner;
class Q6{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER ");
        a=sc.nextInt();
        System.out.print("ENTER SECOND NUMBER ");
        b=sc.nextInt();
        int c = a-b;
        
        System.out.println(a + " X " + b + " = " + a*b);
        System.out.println(a + " + " + b + " = " + a+b);
        System.out.println(a + " - " + b + " = " + c);
        System.out.println(a + " / " + b + " = " + a/b);
        System.out.println(a + " MOD " + b + " = " + a%b);
    }
}