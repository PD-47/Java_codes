import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose two numbers: \n");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b) {
            System.out.print("The largest number is "+a);
        } else {
            System.out.print("The largest number is "+b);
        }

        sc.close();
    }
}
