/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 3) Java Program to print the largest element in an array
 */
public class FindLargestElement {
    public void findLargestElement(int arr[]){
        int largest_elem = arr[0];
        for (int i =1;i<arr.length;i++){
            if (largest_elem <arr[i]){
                largest_elem = arr[i];
                }
        }
        System.out.println("The largest element of the array is ");
        System.out.println(largest_elem);
    }
    
}
