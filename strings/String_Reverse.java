package strings;

public class String_Reverse {
    public static void main(String[] args) {
        String name = "Muskan";
        String rev = "";

//        for (int i=0;i<name.length();i++){
//            System.out.print(name.charAt(name.length()-i-1));
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }

}
