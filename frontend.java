import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (not more than 20): ");
        int n = scanner.nextInt();
        scanner.close();
    }
}
