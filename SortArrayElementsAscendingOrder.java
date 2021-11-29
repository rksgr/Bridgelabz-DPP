/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
9) Java Program to sort the elements of an array in ascending order  
 */
public class SortArrayElementsAscendingOrder {
    public void sortArrayElementsAscendingOrder(int arr[]){
        // Iterate through all the elements of the array
        // The smallest element is placed at the beginning
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                // If an element is smaller
                if (arr[i]>arr[j]){
                    // Exchange the elements 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;  
                }
            }
        }
        System.out.println(" The array elements sorted in ascending order are: ");
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]);  
            System.out.print(" ");
        }
    }
    public static void main(String []args){
        SortArrayElementsAscendingOrder saeao = new SortArrayElementsAscendingOrder();
        int[] arr = new int[]{12,16,98,5,89};
        saeao.sortArrayElementsAscendingOrder(arr);
    }
}
