import java.sql.SQLOutput;
import java.util.Scanner;
                                              //Simple Intrest = Principle*(1+Rate*Time)
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter P");
        long P = input.nextInt();
        System.out.println("enter T");
        long T = input.nextInt();
        System.out.println("enter R");
        float R = input.nextInt();
           R=R/100;
        float Si = 1+(R*T);
        float In = P*Si ;
        System.out.println("Simple Intrest is " + In);
         }
}
