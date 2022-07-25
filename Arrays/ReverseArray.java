/*Write a program to reverse an array or string
Examples : 

    Input  : arr[] = {1, 2, 3}
    Output : arr[] = {3, 2, 1}

    Input :  arr[] = {4, 5, 1, 2}
    Output : arr[] = {2, 1, 5, 4}
*/

package Arrays;

import java.util.Scanner;

/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" elements: ");                          
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // arr = reverse(arr, n);                      //for app-1
        reverse(arr, 0, n-1);
        System.out.print("Reversed Array : ");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }



    //(APPROACH-1)Swapping the elements         { O(n) }

    // public static int[] reverse(int[] arr, int n){          
    //     for(int i=0;i<n/2;i++) {                            
	// 		int temp = arr[i];                              
	// 		arr[i] = arr[n-i-1];                            
	// 		arr[n-i-1] = temp;        
	// 	}                                                   
    //     return arr;                                         
    // }   
    


    //(APPROACH-2) using Recursion              { O(n)}
    
    public static void reverse(int[] arr, int start, int end){
        int temp;
        if(start>=end)
            return;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr, start+1, end-1);
    }
}