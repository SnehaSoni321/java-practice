import java.util.Scanner;

public class StringsBuilder {
    public static void main(String args[]) {
        // //Declaration
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);
        
        // //use charAt
        // System.out.println(sb.charAt(0));

        // // set charAt -> index 0 ki jagah p aa jayega or T hata jayega
        // sb.setCharAt(0,'p');
        // System.out.println(sb);

        // // insert function -> index 0 ki jagah S aayega or T index 1 mei sarak jayega

        // sb.insert(0, 'S');
        // System.out.println(sb);

        // //delete function
        // // yaha start to 2 se hoga per end ke phle hi end ho jayega
        // sb.delete(2, 3);
        // System.out.println(sb);

        //append funtion -> end mei kuch jodana
        // StringBuilder sb = new StringBuilder("h");
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);
        // System.out.println(sb.length());

        // 1. take an arry of strings input from the user and find the cumulative (combined) length of all those strings
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of strings: ");
        // int size = sc.nextInt();

        // String array[] = new String[size];
        // int toLength = 0;

        // for(int i = 0; i<size; i++) {
        //     array[i] = sc.next();
        //     toLength += array[i].length();
        // }
        // System.out.println(toLength);

                // or

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        sc.nextLine();

        for(int i = 0; i<n; i++) {
            System.out.print("Enter string " + (i+1) + ": ");
            arr[i] = sc.nextLine();
        }
        int totalLength = 0;
        for(int i = 0; i<n; i++) {
            totalLength = totalLength + arr[i].length();
        }

        System.out.println("Total length of all strings = "+ totalLength);







    }


    
}
