class point{
	int x;
	int y;
	static int c;
public point(){
	c++;
}
public static void main(String arg[]){
	point p1=new point();
	point p2=new point();
	point p3=new point();
	point p4=new point();
	point p5=new point();
	point p6=new point();
System.out.println(p1.c);
}
}