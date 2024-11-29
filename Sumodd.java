import java.util.Scanner;
class Sumodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i=1 ; i<=6;i++){
            System.out.println("ENTER NUMBER " + i);
            int num = sc.nextInt();
            if (num%2!=0){
            
            sum = sum+num;
            num = 0;
            }
        }
        System.out.println("THE sum is " + sum);
            
            
        
    }
}