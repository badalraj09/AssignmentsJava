import java.util.Scanner;

public class LargestNum_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
          if (n1>n2){
              System.out.println( n1+" is largest num");
          }else {
              System.out.println(n2+" is largest num");
          }
    }
}
