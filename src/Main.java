import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();

        if (num <= 0) {
            System.out.println("That's not positive!");
        } else if (num%2 != 0) {
            if (num%5 == 0) {
                System.out.println("Divisible by 5!");
            }
            if (num%7 == 0) {
                System.out.println("Divisible by 7!");
            }
            if ((num%7 != 0) && (num%5 != 0)) {
                System.out.println("Not divisible by 5 or 7!");
            }
        } else {
            if (num > 1000) {
                System.out.println("Big even number!");
            } else if ((num > 100) && (num < 1000)) {
                System.out.println("Medium even number!");
            } else {
                System.out.println("Small even number!");
            }
        }
    }
}


