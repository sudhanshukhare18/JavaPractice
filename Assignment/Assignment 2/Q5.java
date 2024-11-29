import java.util.Scanner;
class Q5{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER ");
        a=sc.nextInt();
        System.out.print("ENTER SECOND NUMBER ");
        b=sc.nextInt();
        
        System.out.println(a + " X " + b + " = " + a*b);
    }
}