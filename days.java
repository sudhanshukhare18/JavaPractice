import java.util.Scanner;
class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("ENTER DAYS");

        int days=sc.nextInt();
        
        int yr = days/365;
        days = days%365;
        int month = days/30;
        days = days%30;
        
        System.out.println(yr + "Years");
        System.out.println(month + "month");
        System.out.println(days + "Days");


    }
}