import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Take any number:");
        int a = sc.nextInt();
        
        if ( a % 2 == 0) {
            System.out.println("It's a even num.");
         } else {
            System.out.println("It's a odd num.");
         }        
         
         sc.close();
    }

}
