import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The principal amount is: ");
        int p = sc.nextInt();

        System.out.print("Rate of interest per annum(%): ");
        int r = sc.nextInt();

        System.out.print("Time in years: ");
        int t = sc.nextInt();

        int si = ((p*r*t)/100);
        System.out.println("The simple interest is "+si+".");

        sc.close();
    }
}
