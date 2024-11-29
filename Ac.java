//To find the circumference and area of circle
import java.util.*;
class Ac{
	public static void main(String args[]){
		float r;
		float c;
		float a;
		Scanner sc = new Scanner(System.in);
		r = sc.nextFloat();
		System.out.printf("/n %f Radius  of circle is : " + r);
		
		c=2*3.14f*r;
		System.out.printf("/n %F circumfrence of circle is : " + c);
		a=3.14f*r*r;
		System.out.printf("/n %f Area of circle is : " + a);

			}
}