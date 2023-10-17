public class String_builder {
    
    public static void main(String[] args) {
        
        StringBuilder sc = new StringBuilder("");
        for (char ch = 'a'; ch < 'z'; ch++) {
            sc.append(ch);
        }
        System.out.println(sc);
    }
}
