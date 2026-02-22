package Arrays;

import java.util.Scanner;

public class Find_Num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 5;
        int[] find = new int[n];
        for (int i=0;i<n;i++){
            find[i] = sc.nextInt();
        }
        for (int j=0;j<n;j++){
            if (x==find[j]){
                System.out.println("Find Number at"+j);
            }
        }
    }
}
