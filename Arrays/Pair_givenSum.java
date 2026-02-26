package Arrays;

public class Pair_givenSum {
    public static void main(String[] args){
        int [] arr = {2,3,4,5,7};
        int sum = 7;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j] == sum){
                    System.out.println(arr[i]+"\t"+arr[j]);
                }
            }
        }
    }
}
