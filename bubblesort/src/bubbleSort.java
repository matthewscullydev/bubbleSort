
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/*	Matthew Scully CS146 HW2
 *  2/22/22
 */

public class bubbleSort {
	
	public static int [] arr2;

	public static void main(String[] args) throws IOException {
		
		//assign array using createArray function
		int[] arr2 = createArray();
		
		//show initial arrangement of numbers
		printArray(arr2);
		
		//bubble sort array
		bubbleSorte(arr2, 50);
		
		//print new sorted array
		printArray(arr2);
	}
	
	public static int[] createArray() throws IOException
	{
		
		//since this assignment asked for 50 numbers in specific I hardcoded in a 50 int size array
		int[] arr2;
		arr2 = new int[50];
		int i = 0;
		
		//creating file object referencing the data on my desktop and scanning it
		File file = new File("C:/Users/Casual/Desktop/arr1-2.txt");
		Scanner scanner = new Scanner(file);
		
		//while there is still another int in the file assign it to the arrays position and increment
		while(scanner.hasNextInt())
		{
			arr2[i++] = scanner.nextInt();
		}
		
		//return initial array
		return arr2;
	}
	
	public static void printArray(int[] arr2) {
		
		//simple print function
	
		for(int j = 0; j<arr2.length; j++)
		{
			System.out.print(arr2[j] + " ");
		}
		System.out.println();
		
	}
	
	public static void bubbleSorte(int a[], int n)
	{
		
		// first loop says to loop as many times as there are elements in the array
		for (int i = n-1; i >= 1; i--)
		{
			// next loop begins with the inital index and repeats as many times as there are iterations left
			for (int j = 1; j <= i; j++)
			{
				//compare the values, if the value on the left is greater than the one to the right of it, swap them
				if (a[j-1] > a[j])
				{
				
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					
				}
			
			}

		}
	
	}
	
}

