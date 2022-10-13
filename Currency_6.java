import java.sql.SQLOutput;
import java.util.Scanner;

public class Currency_6 {
    public static void main(String[] args) {
        System.out.println("Enter amount in rupees");
        Scanner input = new Scanner(System.in);
        System.out.println("enter rupees");
        double n = input.nextInt();
        System.out.println("enter current value of dollar");
        double d = input.nextInt();
        double ans = n/d;
        System.out.println(ans);
    }
}
// problem in dividing two decimals