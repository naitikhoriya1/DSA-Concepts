public class Set_IthBit {

    public static int SetBit(int n ,int i){
        int intmast = 1<<i;
        return n | intmast;
    }

    public static int clearBit(int n , int i){
        int intmast = ~(1 << i);
        return n & intmast;
    }
    public static int updateIth(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearBit(n, i);
        // }
        // else{
        //     return SetBit(n, i);
        // }

        n = clearBit(n, i);
        int intmast = newBit<<i;
        return n | intmast;
    }
    public static void main(String[] args) {
        System.out.println(updateIth(10, 2, 1));
    }
}
