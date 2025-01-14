 class L124{
	public static void main(String args[]){
	int n=0;
	try{
	n=Integer.parseInt(args[0]);
	if(n<0){
	NegativeException x=new NegativeException("Negative Number Exception Occur ");
	throw x;
	}
	}catch(ArrayIndexOutOfBoundsException ae){
	System.out.println("Index Out of bound : ");
	}catch( NumberFormatException ne){
	System.out.println("Please enter numeric value : ");
	}catch(NegativeException y){
	System.out.println(y.getmsg);
	}
	System.out.println("Square is : "+Math.pow(n,2));
}


}