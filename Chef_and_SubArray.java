import java.util.Scanner;

public class Chef_and_SubArray {

    public static void main(String aar[]) {

        Scanner scan = new Scanner(System.in);

                int t = scan.nextInt();
            while (t-- > 0) {
                int n = scan.nextInt();
                int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
                int count = 0;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                int prodact = 1;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                prodact *= arr[j];
            if (sum == prodact) {
                count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
