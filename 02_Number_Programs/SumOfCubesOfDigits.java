import java.util.Scanner;

class SumOfCubesOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num, sum = 0;

        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }

        System.out.println("Sum of cubes = " + sum);

        sc.close();
    }
}