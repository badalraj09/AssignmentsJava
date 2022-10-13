import java.util.Scanner;

public class ValueCalculator_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number 1");
        int n1 = input.nextInt();
        System.out.println("Input number 2");
        int n2 = input.nextInt();
        System.out.println("enter the sign of operator");
        char c = input.next().charAt(0);
        if (c == '+'){
            System.out.println("sum of n1 and n2 is " + n1+n2);
        }
        if (c == '-'){
            int ans = n1-n2;
            System.out.println("Subtraction of n1 and n2 is " +ans );
        }
        if (c == '*'){
            System.out.println("Multiply of n1 and n2 is " + n1*n2);
        }

        if (c == '/'){
            System.out.println("Divison of n1 and n2 is " + n1/n2);
        }



    }
}
