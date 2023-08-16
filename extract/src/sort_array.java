import java.util.Scanner;
public class sort_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[70];
        int temp;
        System.out.println("Enter the Array limit:");
        int n = in.nextInt();
        System.out.print("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println();

        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}