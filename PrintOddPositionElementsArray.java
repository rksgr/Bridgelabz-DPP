/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
7) Java Program to print the elements of an array present on odd position
 */
public class PrintOddPositionElementsArray {
    public void printOddPositionElementsArray(String arr[]){
        System.out.println("The elements at odd position of the array are: ");
        for (int i=0; i<arr.length;i=i+2){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void main(String []args){
        PrintOddPositionElementsArray popea = new PrintOddPositionElementsArray();
        String arr[] = new String []{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11"};
        popea.printOddPositionElementsArray(arr);
    }
}
