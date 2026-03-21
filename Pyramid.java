import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int n = 5; // default size
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument, using default n=5");
            }
        } else {
            System.out.print("Enter number of rows (or press Enter for 5): ");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) {
                try {
                    n = Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, using default n=5");
                }
            }
            sc.close();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
