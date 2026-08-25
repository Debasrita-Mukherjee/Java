import java.util.Scanner;

class Calculator {

    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the power: ");
        int num2 = sc.nextInt();

        int result1 = Calculator.powerInt(num1, num2);
        System.out.println(num1 + "^" + num2 + " = " + result1);

        // Taking double input
        System.out.print("Enter a double number: ");
        double num3 = sc.nextDouble();

        System.out.print("Enter the power: ");
        int num4 = sc.nextInt();

        double result2 = Calculator.powerDouble(num3, num4);
        System.out.println(num3 + "^" + num4 + " = " + result2);

        sc.close();
    }
}