package Arrays;

public class Second_largest {
    public static void main(String[] args){
        int [] a = {3,8,9,0,4,5};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }

            }
        }
        System.out.println(a[a.length-2]);
    }
}
