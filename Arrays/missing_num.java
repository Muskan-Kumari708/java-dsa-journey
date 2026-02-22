package Arrays;

import java.util.Scanner;

public class missing_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the final number:"); //method-1st
        int n = sc.nextInt();
        int[] a1 = {1,3,4,5};
        int sum = 0;

        for (int i=0;i<a1.length;i++){
           sum = sum+a1[i] ;
        }
        int missing = (n*(n+1)/2)-sum;
        System.out.println("Missing number is :" + missing);

//        int[] a2 = {1, 2, 3, 4, 5};      // method-2nd(this is slow as compare to 1st)
//        for (int j=0;j<a2.length;j++){
//            int count = 0;
//            for (int i=0;i<a1.length;i++) {
//                if (a2[j] == a1[i]) {
//                   count++;
//                }
//            }
//               if (count==0){
//                   System.out.println(a2[j]);
//               }
//
//        }

    }

}
