interface IA{
void add();
}
interface IB{
void add1();
}

interface IC extends IA,IB{
void c();
}

class test implements IC{
	public void add(){
	System.out.println("This is IA implementation ");
	}
	public void add1(){
	System.out.println("This is IB implementation ");
	}
	public void c(){
	System.out.println("This is IC implementation ");
	}
	public void hello(){
	System.out.println("This is Test Class ");
	}
	public static void main(String args[]){
	IA obj =new test();
	obj.add();
	IB obj2 =new test();
	obj2.add1();
	IC obj3 =new test();
	obj3.c();
	test t=new test();
	t.hello();
	t.add1();
	t.c();
	}
	
	}