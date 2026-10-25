public class MethodsDemo {
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }

    public static void main(String[] args) {
        int localNumber = 10;
        System.out.println("Integer addition: " + add(5, 3));
        System.out.println("Decimal addition: " + add(2.5, 1.5));
        System.out.println("Local variable: " + localNumber);
    }
}
