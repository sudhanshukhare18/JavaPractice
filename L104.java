import java.util.Scanner;
class point{
	private int x;
	private int y;
public int getX(){
return x;
}
public void setX(int x){
this.x=x;
}
public int getY(){
return y;
}
public void setY(int y){
this.y=y;
}


public void showdata(){
System.out.println("X_CO"+x);
System.out.println("Y_CO"+y);
}
public static void main(String args[]){
	point p=new point();
	p.setX(11);
	p.setY(22);
	System.out.println("X_CO : "+p.getX());
	System.out.println("Y_CO : "+p.getY());

	}

}