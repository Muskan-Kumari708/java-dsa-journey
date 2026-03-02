package Arrays;

public class RotateArray {
    public static void main(String[] args){
        int [] a = {1,2,3,4,5,6,7};
        int k=3;
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.println();
        for (int i=0;i<k;i++){
            for (int j=a.length-1;j>0;j--){
                int t = a[j-1];
                a[j-1] = a[j];
                a[j] = t;

            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
