class parent{
	public void show(){
	System.out.println("Parent child ");
	
	}
}
class child extends parent{
	public void show(){
	System.out.println("Child Child Fun Fun");
	}
	
	public static void main(String args[]){
	parent c=new child();
	c.show();
	
}
}