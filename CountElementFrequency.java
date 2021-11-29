/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
2) Java Program to find the frequency of each element in the array
 */
public class CountElementFrequency {
    public void countElementFrequency(int arr[]){
        int arr_vist[] = new int[arr.length];
        int indx = 0;
        //int count = 0;
        for (int i=0;i<arr.length;i++){
            int count = 1;
            boolean cnt_prev = false;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;     
                }
            }   
            //if (count>0){
            for (int k=0; k<arr_vist.length;k++){
                if (arr[i]==arr_vist[k]){
                    cnt_prev = true;
                    break;
                }
            }
            arr_vist[indx] = arr[i];
            indx++;
            if (cnt_prev ==false){
                System.out.print("Frequency of the occurrence of element ");
                System.out.println(arr[i]);
                System.out.print(" = ");
                System.out.println(count);
            }
            }
        }   
    public static void main(String []args){
        CountElementFrequency cef = new CountElementFrequency();
        int arr1[] = new int[]{1,2,3,4,1,9,1,4};
        cef.countElementFrequency(arr1);
    }
}
