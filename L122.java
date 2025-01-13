 class L122{
	public static void main(String args[]){
	int n=0;
	try{
	n=Integer.parseInt(args[0]);
	}catch(ArrayIndexOutOfBoundsException ae){
	System.out.println("Index Out of bound : ");
	}catch( NumberFormatException ne){
	System.out.println("Please enter numeric value : ");
	}
	System.out.println("Square is : "+Math.pow(n,2));
}


}