/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 5) Java Program to print the elements of an array present on an even position
 */
public class PrintEvenPositionElements {
    public void printEvenPositionElements(int arr[]){
        System.out.println("The elements present in the even position of the array are: ");
        // The value of i is incremented by 2 in every iteration
        for (int i =1; i<arr.length;i=i+2){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void main(String []args){
        PrintEvenPositionElements pepe = new PrintEvenPositionElements();
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        pepe.printEvenPositionElements(arr);
    }
    
}
