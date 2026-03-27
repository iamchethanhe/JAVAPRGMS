import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basic = sc.nextDouble();
        double hra = sc.nextDouble();
        double da = sc.nextDouble();
        double bonus = sc.nextDouble();
        double deduction = sc.nextDouble();

        double salary = basic + hra + da + bonus - deduction;

        System.out.println("Net Salary = " + salary);

        sc.close();
    }
}