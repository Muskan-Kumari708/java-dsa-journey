package Arrays;

public class PlusOne {
    public static void PrintArray(int [] ar){
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }

    }
    public static void main(String[] args){
        int [] a = {1,2,3};
        int [] arr = new int[a.length+1];
        for (int i=a.length-1 ;i>=0;i--) {
            if (a[i] < 9) {
                a[i]++;
                PrintArray(a);
                return;
            } else {
                a[i] = 0;
            }
        }
            arr[0]=1;
            PrintArray(arr);



    }
}
