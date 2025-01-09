interface IA{
void add();
}
class test implements IA{
	public void add(){
	System.out.println("This is IA implementation ");
	}
	public void hello(){
	System.out.println("This is Test Class ");
	}
	public static void main(String args[]){
	IA obj =new test();
	obj.add();
	test t=new test();
	t.hello();
	}
	
	}