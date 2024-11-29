class swap{
	public static void main(String args[]){
		int a = 5;
		int b = 7;
		System.out.println("Before swapping :");
		System.out.printf(" A =%d B =%d",a,b);
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println(" /n After swapping : ");
		System.out.printf("A =%d B =%d",a,b);
		
}
}