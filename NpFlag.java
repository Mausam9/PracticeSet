public class NpFlag {
    static void pattern(int n) {
        for (int a = 1; a <= 2; a++) {
            for (int i = 1; i < n; i++) {
                System.out.print("\t\t\t\t\t\t");
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("\t\t\t\t\t\t");
            System.out.println("*");
        }
    }
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        pattern(10);
    }
}
