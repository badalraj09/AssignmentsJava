import java.util.Scanner;

public class EvenOdd_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
         if(n%2 == 0){
             System.out.printf("%d is Even",n);
         }else
         {
             System.out.printf("%d is Odd",n);
         }
    }
}
