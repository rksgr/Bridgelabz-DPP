/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
10) Find second Largest Number in an Array
 */
public class SecondLargestElementArray {
    public void secondLargestElementArray(int arr[]){
        int largest = arr[0];
        int second_largest = arr[0];
        for (int i= 1;i<arr.length; i++){
            if (arr[i] > largest){
                second_largest = largest;
                largest = arr[i];           
            }
            else if (arr[i]> second_largest){
                second_largest = arr[i];
            }
        }
        System.out.print("The largest element of the array = ");
        System.out.println(largest);
        System.out.print("The second largest element of the array = ");
        System.out.println(second_largest);
        }
    public static void main(String []args){
        SecondLargestElementArray slea = new SecondLargestElementArray();
        int arr[] = new int []{12,19,84,64,47};
        slea.secondLargestElementArray(arr);
    }
    
}
