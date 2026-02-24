package Arrays;

public class first_repeating {
    public static void main(String[] args){
        int [] arr = {1,2,5,3,4,3,5};
        for (int i=0;i<arr.length;i++){
            int j;
            for (j=0;j<i;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    return;
                }

            }


        }

    }
}
