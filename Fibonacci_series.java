import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1, count = 2;

        System.out.println("Choose the value of n:");
        int n = sc.nextInt();

        System.out.print("Fibonacci series: "+a+", "+b);

        while (count<n) {

            int temp = b;            
            b = b+a;
            a=temp;
            
            count++;

            System.out.print(", "+b);
        }

        sc.close();
    }
}
