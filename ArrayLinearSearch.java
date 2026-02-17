import java.util.*;

public class ArrayLinearSearch {
    public static void main(String args[]) {
        //1. find element present
        // int arr[] = {4,5,3,6};
        // int ele = 5;
        // for(int i = 0; i<arr.length; i++) {
        // if(arr[i] == ele) {
        // System.out.println("Element is finded");
        // }
        // }
        
        // or

        // find element present or not input for the user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of array: ");
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // System.out.println("Enter elements: ");
        // for(int i = 0; i<size; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the element to find: ");
        // int x = sc.nextInt();

        // boolean found = false;

        // for(int i = 0; i<arr.length; i++) {
        // if(arr[i] == x) {
        // found = true;
        // break;
        // }
        // }
        // if(found) {
        // System.out.println("Element is present");
        // } else {
        // System.out.println("Element is not present");
        // }

        //2. first occurrence -> jab koi element array me pehli bar mile uska index print karna.
        // bad mei vo element phir mile ignore kar dena
     
        // int arr[] = {2,4,2,5,2,3};
        // int occ = 2;
        // for(int i = 0; i<arr.length; i++) {
        //     if(arr[i] == occ) {
        //         System.out.println("First occurrence at index: "+i);
        //         break;
        //     }
        // }

        // //3. count occurrence
        // int arr[] = {5,4,5,6,5,4};
        // int x = 5;
        //  int count = 0;
        //  for(int i = 0; i<arr.length; i++) {
        //     if(arr[i] == x) {
        //         count++;
        //     }
        //  }
        //  System.out.println("Occurrence: "+count);

        // 3. occurrence element no print double
        int arr[] = {2,4,2,5,2,3};

        for(int i = 0; i<arr.length; i++) {
           boolean alreadyPrint = false;

           for(int j = 0; j<i; j++) {
            if(arr[i] == arr[j]) {
                alreadyPrint = true;
                break;
            }
           }
           if(!alreadyPrint) {
            System.out.println(arr[i]);
           }
        }

       
        
       
        

        //4. remove duplicate

        // int arr[] = {4,6,3,4,7,4};
        // for(int i = 0; i<arr.length; i++) {
        //     boolean isDuplicate = false;

        //     for(int j = 0; j<i; j++) {
        //         if(arr[i] == arr[j]) {
        //             isDuplicate = true;
        //             break;
        //         }
        //     }
        //     if(!isDuplicate) {
        //         System.out.println(arr[i] + " ");
        //     }

        // }


        


    }


}
