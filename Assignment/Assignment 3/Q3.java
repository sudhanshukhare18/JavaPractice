import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      if(s.length()<5){
        System.out.println("Short");
      }
      char ch[]=s.toCharArray();
      for(int i=0;i<ch.length;i++){
        if(ch[i]>'a' && ch[i]<'z' || ch[i]<0||ch[i]>31){
          
        }
        else{
          System.out.println("special characters Contains");
          break;
        }
      }
  }
}