import java.util.Scanner;
class sec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("ENTER DAYS");

        int sec=sc.nextInt();
        
        int hour=sec/3600;
        int min = (sec-hour*3600)/60;
        sec = sec%60;
        
        
        System.out.println("H:M:S : " + hour +":" + min +":"+sec);

    }
}