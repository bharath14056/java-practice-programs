class MyNamePattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            // ===== B =====
            for (int j = 0; j < n; j++) {
                if (
                    j == 0 ||
                    (i == 0 && j < n - 1) ||
                    (i == n / 2 && j < n - 1) ||
                    (i == n - 1 && j < n - 1)
                )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.print("   "); // space between letters

            // ===== H =====
            for (int j = 0; j < n; j++) {
                if (
                    j == 0 ||
                    j == n - 1 ||
                    i == n / 2
                )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.print("   "); // space between letters

            // ===== A =====
            for (int j = 0; j < n; j++) {
                if (
                    i == 0 ||
                    i == n / 2 ||
                    j == 0 ||
                    (j == n - 1 && i != n - 1)
                )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
