import java.util.*;
public class Sorting {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]) {
        // //time complexity = O(n^2)
        // //Bubble sort
        // int arr[] = {7,8,3,1,2};

        // for(int i = 0; i<arr.length-1; i++) { // n-1
        //     for(int j = 0; j<arr.length-1-i; j++) {
        //        if(arr[j] > arr[j+1]) {  // i counter h yaha index of element j se difine ho raha h
        //         //swap
        //         int temp = arr[j];
        //         arr[j] = arr[j+1];
        //         arr[j+1] = temp;

        //        }
        //     }
        // }
        // printArray(arr);

        //selection sort
        // time complexity = O(n^2)

        // int arr[] = {6,4,7,3,1};

        // for(int i = 0; i<arr.length-1; i++) {
        //     int smallest = i;
        //     for(int j=i+1; j<arr.length; j++) {
        //         if(arr[smallest] > arr[j]) {
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }
        // printArray(arr);

        //insertion sort

        int arr[] = {4,5,3,6,2};

        for(int i = 1; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;

            while(j>=0 && current<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        printArray(arr);

    }
    
}
