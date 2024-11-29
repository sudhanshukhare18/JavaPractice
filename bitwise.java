class bitwise{
	public static void main(String args[]){
		int x,y;
		x=5;
		y=7;
		System.out.println("Before swapping");
		System.out.println("A = " + x + " B = "+y);
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("After swapping");
		System.out.println("A = " + x + " B = "+y);
		
		
 	}
}