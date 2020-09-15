import java.util.Scanner;
import java.lang.Math;
public class One {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int N = 10;
        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = (int) (Math.random() * 11);
            sum += arr[i];
        }
        int sum1 = 0;
        int n = N;
        while (n > 0) {
            n--;
            sum1 += arr[n];
        }
        int sum2 = 0;
        n = 10;
        do {
            n--;
            sum2 += arr[n];
        } while (n > 0);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}