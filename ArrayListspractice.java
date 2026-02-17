import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListspractice {
    public static void main(String args[]) {

        //1. Ek ArrayList banao jisme 5 integers add karo -> saare element print karo , total size print karo
    //     ArrayList<Integer> arrayList = new ArrayList<>();
    //     arrayList.add(1);
    //     arrayList.add(2);
    //     arrayList.add(3);
    //     arrayList.add(4);
    //     arrayList.add(5);
    //     System.out.println(arrayList);

    //    int size = arrayList.size();
    //     System.out.println(size);
        
    // 2. user se 5 no. lo or Array/list mei store karo
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr  = new ArrayList<>();

    //5 no. input lo
    for(int i = 0; i<5; i++) {
        int nums = sc.nextInt();
        arr.add(nums);
    }

    int max = arr.get(0);
    for(int i = 0; i<arr.size(); i++) {
        if(arr.get(i) > max) {
            max = arr.get(i);
        }
    }
    System.out.println(max);

    }
    
}
