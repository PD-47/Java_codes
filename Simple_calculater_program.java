import java.util.Scanner;

public class Simple_calculater_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Take First number: \n");
        double a = sc.nextDouble();

        System.out.print("Take second number: \n");
        double b = sc.nextDouble();

        System.out.print("Choose an operator to calculate those two numbers: ");
        char ch = sc.next().charAt(0);

        double sum = 0;

        if ( ch == '+' ) {
            sum = (a+b);
        } else if ( ch == '-') {
            sum = (a-b);
        } else if ( ch == '*') {
            sum = (a*b);
        } else if ( ch == '/') {
            sum = (a/b);
        } else if ( ch == '%') {
            sum = (a%b);
        } else {
            System.out.println("wrong operator.");
        }

        System.out.println("Calculation: "+ sum);

        sc.close();
    }
}
