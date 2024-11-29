import java.util.Scanner;
class ex1{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any character");
	char c;
	c = sc.next().charAt(0);

	switch(c){
	case 'a' :
	case 'A' :
	System.out.println("It is vowel");
	break;
	case 'e' :
	case 'E' :
	System.out.println("It is vowel");
	break;
	case 'i' :
	case 'I' :
	System.out.println("It is vowel");
	break;
	case 'o' :
	case 'O' :
	System.out.println("It is vowel");
	break;
	case 'u' :
	case 'U' :
	System.out.println("It is vowel");
	break;

	default :
	System.out.println("It is not vowel");
}
}
}