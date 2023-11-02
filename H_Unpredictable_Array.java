/**
 *
 * @author Purvam Sheth
 */

import java.util.Scanner;
public class H_Unpredictable_Array {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String arrline = scanner.nextLine();
		String[] integersAsText = arrline.split(" "); 
		int[] results = new int[ integersAsText.length ]; 
		int i = 0;  
		 
		for ( String textValue : integersAsText ) { 
		    results[i] = Integer.parseInt( textValue );  
		    i++;  
		}  
		
		int sum=0;
		for(int j=0;j<results.length-1;j++)
		{
			int diff = results[j]-results[j+1];
			sum=sum+Math.abs(diff);
		}
		System.out.println(sum);
		scanner.close();
	
	}
}
