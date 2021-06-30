import java.util.Scanner;
class Sample{
public static void main(String args[]){
Scanner scn = new Scanner (System.in);
		System.out.print("Enter no. of elements you want in array:");
                int n = scn.nextInt();
 
		int arr[] = new int[n];
                System.out.println("Enter all the elements:");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = scn.nextInt();
		}
		for (int i = 0; i < arr.length; i++){  
			for (int j = i + 1; j < arr.length; j++){  
				int tmp = 0;  
				if (arr[i] > arr[j]){  
				tmp = arr[i];  
				arr[i] = arr[j];  
				arr[j] = tmp;  
				}  
			}  
		System.out.print(arr[i]+" ");  
}  
}
}