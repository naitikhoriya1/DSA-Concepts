public class test {
    
    public static void main(String[] args) {
        
        int x = 3, y = 4;
        x = x^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x: " + x); // prints 7
        System.out.println("y: " + y); 

        for(char ch='A';ch<='Z';ch++) {
            System.out.println((char)(ch|' '));
        }
    }
}
