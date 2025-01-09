abstract class rgpv{
	rgpv(){
	System.out.println("Constructor Balle Balle");
	}
	public abstract void lab();
	public abstract void cctv();
	public void copycheck(){
	System.out.println(" copy check Ho jayegi balle balle " );	
	}
}
class college extends rgpv{
	college(){
	System.out.println("Andar se balle balle");
	}
public void cctv(){
	System.out.println("This is cctv hogyi tu balle balle");
	}
public void lab(){
	System.out.println("This is lab Ho jayegi balle balle");
	}
public void staff(){
	System.out.println("This is staff Dholna sun dil di pukar");
	}

public static void main(String args[]){
	rgpv r=new college();
	r.lab();
	r.copycheck();
	college t1=new college();
	t1.cctv();	
	t1.lab();
	t1.copycheck();
	t1.staff();
	
}
}