/**
 *
 * @author Purvam Sheth
 */

import java.util.Random;
public class MaxSubArray {

    public void bf_MaxSubArray(int[] arr) {

        int n = arr.length;
        int max = 0, add = 0;
        for (int i = 0; i < n; i++) {
            add = 0;
            for (int j = 0; j < n; j++) {
                add += arr[j];
                if (add > max) {
                    max = add;
                }
            }
        }
    }
    
    public int r_MaxSubArray(int[] arr, int low, int high) {

        if (high == low) {
            return arr[low];
        }
        int mid = (high + low) / 2;
        return Math.max(Math.max(r_MaxSubArray(arr, low, mid),
                r_MaxSubArray(arr, mid + 1, high)),
                maxCrossingSum(arr, low, mid, high));
    }
    
    static int maxCrossingSum(int arr[], int l,
            int m, int h) {

        int add = 0;
        int leftadd = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            add = add + arr[i];
            if (add > leftadd) {
                leftadd = add;
            }
        }

        add = 0;
        int rightadd = Integer.MIN_VALUE;
        for (int i = m + 1; i <= h; i++) {
            add = add + arr[i];
            if (add > rightadd) {
                rightadd = add;
            }
        }

        return Math.max(leftadd + rightadd, Math.max(leftadd, rightadd));
    }

    

    public static void main(String[] args) {
        int num = 1;
        MaxSubArray obj = new MaxSubArray();
        while (num < 100) {
            int[] a = new int[num];
            Random random = new Random();
            for (int i = 0; i < num; i++) {
                a[i] = random.nextInt(100);
            }
            long time_bf = 0, time_r = 0;
            long start_time = System.currentTimeMillis();
            obj.bf_MaxSubArray(a);
            long end_time = System.currentTimeMillis();
            time_bf = end_time - start_time;
            start_time = System.currentTimeMillis();
            end_time = System.currentTimeMillis();
            time_r = end_time - start_time;
            if (time_r < time_bf) {
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
