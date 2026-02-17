public class ArrayReverseArray {
    public static void main(String args[]) {

        //1. Reverse array
        //  int arr[] = {3,4,5};
        //  for(int i = arr.length-1; i>=0; i--) {
        //     System.out.println(arr[i]);
        //  }

        //2(i). rotate array left by 1
        // int arr[] = {1,2,3,4,5,6,7,8};
        // int first = arr[0];
        // for( int i = 0; i<arr.length-1; i++) {
        //     arr[i] = arr[i+1];
        // }
        // arr[arr.length - 1] = first;

        // for (int num : arr) {
        //     System.out.println(num + " ");
        // }

        //2(ii). rotate array rigth by 1
        int arr[] = {1,2,3,4};
        int last = arr[arr.length-1];
        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        for(int num : arr) {
            System.out.println(num + " ");
        }
    }
    
}
