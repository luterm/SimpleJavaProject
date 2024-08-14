public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int sum = addNumbers(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);

        printNumbers(5);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void printNumbers(int n) {
        System.out.println("Printing numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
