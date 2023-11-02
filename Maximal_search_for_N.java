

/**
 *
 * @author Purvam Sheth
 */

import java.util.Scanner;
public class Maximal_search_for_N {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int[] n = new int[8];
		
		n[0] = (int)Math.pow(2, t);
		n[1] = (int)Math.pow(t, 2);
		n[2] = t;
		n[4] = (int)Math.floor((float)Math.sqrt(t));
		n[5] = (int)Math.floor((float)Math.cbrt(t));
		n[6] = (int)Math.round(Math.log(t)/Math.log(2));
		
		for(int i=0;i<Integer.MAX_VALUE;i++)
		{
			if(Math.pow(i, i) >= Math.pow(2, t))
			{
				n[3]=i-1;
				break;
			}
		}
		int multi = 1;
		for(int i=2;i<Integer.MAX_VALUE;i++)
		{
			multi=i*multi;
			if(multi >= t)
			{
				n[7] = i-1;
				break;
			}
		}
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+" ");
		}
		scanner.close();
	}
}
