public class subString {
    public static String substring(String str , int suru, int end){
        String substr = "";
        for (int i = suru; i < end; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "Ethical_khoriya";
        System.out.println(substring(str, 0, 8));
    }
}
