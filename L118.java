interface IA{
void add();
}
interface IB{
void add1();
}
class test implements IA,IB{
	public void add(){
	System.out.println("This is IA implementation ");
	}
	public void add1(){
	System.out.println("This is IB implementation ");
	}
	
	public void hello(){
	System.out.println("This is Test Class ");
	}
	public static void main(String args[]){
	IA obj =new test();
	obj.add();
	test t=new test();
	t.hello();
	t.add1();
	
	}
	
	}