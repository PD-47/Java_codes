import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a n umber:");
        int number = sc.nextInt();

        int original = number;

        int reverse = 0;

        while (number>0) {
            int rem = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + rem;
        }

        System.out.print("The reverse number is: "+reverse);

        if (reverse == original) {
            System.out.println("\n"+original+" is palindrome.");
        } else {
            System.out.println(original+" is not palindrome.");
        }

        sc.close();
    }
}
