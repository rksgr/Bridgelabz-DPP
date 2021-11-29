/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
8) Java Program to print the duplicate elements of an array
 */
public class DuplicateElementsArray {
    public void duplicateElementsArray(int arr[]){
        System.out.println("The duplicate elements of the array are: ");
        int arr_visited[] = new int[arr.length];
        int count =0;
        for (int i=0;i<arr.length;i++){
            boolean duplicate = false;
            int visited = -1;
            for (int j=i+1;j<arr.length;j++){
                
                if (arr[i]==arr[j]){
                    duplicate = true;
                    visited++;
                    break;
                    }   
                }           
            if (duplicate == true){
                // to check if the element has already been considered as a duplicate
                for (int k=0; k<arr_visited.length; k++){
                    if (arr[i]==arr_visited[k]){
                        visited++;
                        break;
                    }
                }
                if(visited ==0){
                    // The value of visited is 0 if the element doesn't occur in 
                    // arr_visited, ie, it has not been counted as a duplicate already.
                    System.out.print(arr[i]);
                    System.out.print(" ");
                    arr_visited[count] = arr[i];
                    count++;
                    }
                }
        }
        }   
    public static void main(String []args){
        DuplicateElementsArray dea = new DuplicateElementsArray();
        int arr[] = new int []{12,3,4,5,1,8,3,8,3};
        dea.duplicateElementsArray(arr);
    }
}
