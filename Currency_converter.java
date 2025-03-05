import java.util.Scanner;

public class Currency_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Indian currency:");
        double rupees = sc.nextDouble();

        double usd = rupees * 0.012;

        System.out.print("Output in USD: $"+usd);

        sc.close();
    }
}
