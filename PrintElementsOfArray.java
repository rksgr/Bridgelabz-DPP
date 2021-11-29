/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 1. write a program to print the elements of an array
 */
public class PrintElementsOfArray {
    public static void main(String []args){
        int arr[] = new int[]{1,2,3,4};
        
        // Print elements of an array using for each loop
        // for each loop is simplest form of for loop
        // initialize i, colon and then array name
        for(int i :arr){
            System.out.println(i);
        }
    }
}

