import java.util.Arrays;
import java.util.Scanner;
class Sample
{
	static int removeDuplicates(int arr[], int n)
	{
		if (n==0 || n==1)
			return n;
	
		int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
	}
	
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
                int n = scn.nextInt();
 
		int arr[] = new int[n];
                System.out.println("Enter all the elements:");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = scn.nextInt();
		}
		int nn = arr.length;
		Arrays.sort(arr);
		n = removeDuplicates(arr, n);

		
		for (int i=0; i<n; i++)
		System.out.print(arr[i]+" ");
	}
}
