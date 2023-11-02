/**
 *
 * @author Purvam Sheth
 */

import java.util.Scanner;
import java.util.Arrays;

public class H_unpredictable_array_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arrline = scanner.nextLine();
        String arrline1 = scanner.nextLine();

        String[] integersAsText = arrline.split(" ");
        String[] integersAsText1 = arrline1.split(" ");

        int size = integersAsText.length;
        int[] results = new int[size];
        int i = 0;
        for (int j = 0; j < size; j++) {
            results[i] = Integer.parseInt(integersAsText[j]);
            i++;
        }
        int num = Integer.parseInt(integersAsText1[0]);
        int replaceNum = Integer.parseInt(integersAsText1[1]);
        results = Arrays.stream(results).map(z -> z == num ? replaceNum : z).toArray();
        int sum = 0;
        if (results.length == 1) {
            sum = results[0];
            System.out.println(sum);
            scanner.close();
            return;
        }
        for (int j = 0; j < results.length - 1; j++) {
            int difference = results[j] - results[j + 1];
            sum = sum + Math.abs(difference);
        }
        System.out.println(sum);
        scanner.close();
    }
}
