class Patterns {
    public static void main(String[] args) {
        // Pattern 1: Right Angle Triangle (Increasing)
        System.out.println("Pattern 1: Right Angle Triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Pattern 2: Right Angle Triangle (Decreasing)
        System.out.println("\nPattern 2: Right Angle Triangle (Decreasing)");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 3: Pyramid Pattern
        System.out.println("\nPattern 3: Pyramid Pattern");
        int n = 5; // Height of the pyramid
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 4: Diamond Pattern
        System.out.println("\nPattern 4: Diamond Pattern");
        int rows = 5; // Number of rows
        // Top half of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bottom half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 5: Number Pyramid
        System.out.println("\nPattern 5: Number Pyramid");
        for (int i = 1; i <= 5; i++) {
            // Print spaces
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
