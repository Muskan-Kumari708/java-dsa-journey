package Arrays;

public class First_Last_Elements {
    public static void main(String[] args){
        int [] array = {5,9,0,8,3,4,17};
        for (int i=0;i< array.length;i++){
            if (array[i]==array[0] || array[i]==array[array.length-1]){
                System.out.println(array[i]);
            }
        }

    }
}
