import java.util.Scanner;

class BankAccount {
    double balance = 0;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter deposit amount: ");
        double d = sc.nextDouble();
        acc.deposit(d);

        System.out.print("Enter withdrawal amount: ");
        double w = sc.nextDouble();
        acc.withdraw(w);

        acc.display();
        sc.close();
    }
}