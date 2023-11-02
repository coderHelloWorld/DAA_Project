
/**
 *
 * @author Purvam Sheth
 */
import java.util.Scanner;

public class BubbleSortImplementation {

    public void BubbleSort(int arr[]) {
        int j, n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void ShowArray(int arr[]) {
        int i;
        int n = arr.length;
        for (i = 0; i < n; ++i) {
            System.out.println(arr[i] + "");
        System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        BubbleSortImplementation obj = new BubbleSortImplementation();
        obj.BubbleSort(arr);
        obj.ShowArray(arr);
        input.close();
    }
}
