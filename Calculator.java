class Calculator {

    // Method to calculate power of integers
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Method to calculate power of double
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {

        // Testing powerInt()
        int result1 = Calculator.powerInt(2, 5);
        System.out.println("2^5 = " + result1);

        // Testing powerDouble()
        double result2 = Calculator.powerDouble(2.5, 3);
        System.out.println("2.5^3 = " + result2);
    }
}