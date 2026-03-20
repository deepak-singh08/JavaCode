import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int n = 5; // default half-height (middle row count)
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument, using default n=5");
            }
        } else {
            System.out.print("Enter diamond half-height (or press Enter for 5): ");
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

        // Upper half (including middle)
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}
