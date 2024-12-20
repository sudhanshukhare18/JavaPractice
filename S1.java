import java.util.*;

public class Main {
    public static void main(String[] args) {
      String s="Betty got a bit of bitter better butter";
      
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='b'||s.charAt(i)=='t'){
          System.out.println(i);
        }
      }
      
  }
}