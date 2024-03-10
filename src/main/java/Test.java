import java.util.Scanner;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] sum = new int[m+1];
        scanner.nextLine();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int max1 = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max1) {
                max1 = a[i];
            }
        }

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            sum[i] = i-a[i];
        }

        int max = sum[0];

        for (int i = 1; i < sum.length; i++) {
            if (sum[i] > max) {
                max = sum[i];
            }
        }
        System.out.println(max);
    }
}

