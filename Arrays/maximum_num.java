package Arrays;

public class maximum_num {
    public static void main(String[] args){
        int [] maximum ={2,1,9,0,10,90,5};
        int i=0;
        int max = maximum[0];
        for (i=1;i<maximum.length;i++) {
            if (maximum[i] > max) {
                max = maximum[i];
            }
        }
        System.out.println("Maximum Number is:"+max);





    }
}
