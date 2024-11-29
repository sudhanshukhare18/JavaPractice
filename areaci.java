import java.util.Scanner;
class areaci{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float r , ar,cir;
	System.out.println("ENTER RADIUS");
	r=sc.nextFloat();
	ar = 3.14f*r*r;
	cir=2*3.14f*r;
	System.out.println("The area of Circle is : " + ar);
	System.out.println("The circumference of circle is : " + cir);
	}
}