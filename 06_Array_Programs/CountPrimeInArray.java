import java.util.Scanner;

public class CountPrimeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int flag = 0;

            if (num <= 1)
                 continue;

            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}