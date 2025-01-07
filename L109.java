class test{
	public void add(){
	int a,b,c;
	a=1;
	b=2;
	c=a+b;
	System.out.println("Addition without argument : "+c);
	
	}
	public void add(int a , int b){
	int c;
	
	c=a+b;
	System.out.println("Addition without argument : "+c);
	
	}
	public static void main(String args[]){
	test t=new test();
	t.add();
	t.add(5,2);
}
}