import java.util.Scanner;

class PrimeNumbersBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number ");
        int start = sc.nextInt();

        System.out.print("Enter end number ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2)
                System.out.print(i + " ");
        }

        sc.close();
    }
}