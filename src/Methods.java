public class Methods {

    static void print2kaTable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("-> " + ans);
        }
    }

    static void printsum(int x, int y) {
        System.out.println("SUM: " + (x + y));
    }

    static void printMultiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Result: " + ans);
    }

    // Method with return value
    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }

    // Method overloading
    static int add(int p, int q, int r) {
        int ans = p + q + r;
        return ans;
    }

    public static void main(String[] args) {

        System.out.println("hi");

        print2kaTable();

        System.out.println("bye");

        printsum(5, 10);

        printMultiplication(5, 10);

        int result = add(12, 14);
        System.out.println("Result: " + result);

        int ans1 = add(1, 2);
        int ans2 = add(1, 2, 3);

        System.out.println("ans1: " + ans1);
        System.out.println("ans2: " + ans2);
    }
}