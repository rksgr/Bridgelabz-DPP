/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
6) Java Program to print the elements of an array in reverse order
 */
public class PrintArrayElementsReverseOrder {
    public void printArrayElementsReverseOrder(String arr[]){
        System.out.println("The elements of the array printed in reverse order are:");
        for (int i=arr.length-1; i>-1; i--){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    public static void main(String []args){
        // creating an instance of the class and invoking the method
        String arr [] = new String[]{"Java", "language", "James Gosling"};
        PrintArrayElementsReverseOrder paero = new PrintArrayElementsReverseOrder();
        paero.printArrayElementsReverseOrder(arr);
    }
    
}
