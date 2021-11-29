/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 4) Java Program to print the smallest element in an array
 */
public class SmallestElementArray {
    public void smallestElement(int arr[]){
        int smallest_elem = arr[0];
        for (int i =1; i<arr.length;i++){
            if (smallest_elem > arr[i]){
                smallest_elem = arr[i];
            }
        }
        System.out.println("The smallest element of the array = ");
        System.out.println(smallest_elem);
    }
    public static void main(String []args){
        SmallestElementArray sea = new SmallestElementArray();
        int arr[] = new int[]{12,19,5,78,32};
        sea.smallestElement(arr);
    
}
}
