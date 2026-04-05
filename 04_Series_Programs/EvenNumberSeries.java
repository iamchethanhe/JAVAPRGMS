import java.util.Scanner;

class EvenNumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((2 * i) + " ");
        }

        sc.close();
    }
}