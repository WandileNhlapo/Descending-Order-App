/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descendingorder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author walter n
 */
public class DescendingOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        
        Integer n = sc.nextInt();
        System.out.println("Enter the Array elements");
        
        Integer[] arr = new Integer[n];
        for(int i = 0; i <n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.printf("Original Array: %s", Arrays.toString(arr));
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        System.out.printf("\n\nSorted Array:  %s", Arrays.toString(arr));
        
    }
    
}
