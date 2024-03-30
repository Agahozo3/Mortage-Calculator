import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        System.out.print("Enter loan term (in years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * 12;

        double monthlyPayment = calculateMonthlyPayment(loanAmount, monthlyInterestRate, numberOfPayments);

        System.out.println("Monthly payment: " + monthlyPayment);
    }

    public static double calculateMonthlyPayment(double loanAmount, double monthlyInterestRate, int numberOfPayments) {
        double monthlyPayment;
        monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        return monthlyPayment;
    }
}

