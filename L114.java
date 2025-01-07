class point{
	int x;
	int y;
	static int c;
	public	point(){
	c++;
	}
	static{
	c =100;
	System.out.println("Happy Birthday");
	}
	public static int getctr(){
	return c;
	}
	static{
	c =100;
	System.out.println("Happy Birthday2");
	}
public static void main(String arg[]){
	point p1=new point();
	point p2=new point();
	point p3=new point();
	point p4=new point();
	point p5=new point();
	point p6=new point();
	System.out.println(p1.c);
	System.out.println(c);
	System.out.println(point.c);
	System.out.println(p1.getctr());
	System.out.println(point.getctr());
	System.out.println(getctr());
	
	
}
static{
	c =100;
	System.out.println("Happy Birthday3");
	}
}