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

    public static int clearIBits(int n ,int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int ClearRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) -1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOrNot(int n){
        return (n &( n-1)) == 0;
    }

    public static int countBit(int n){
        int count = 0;
        while (n>0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a , int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans *a;
            }
            a = a *a;
            n =n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo( 3, 5));
        System.out.println(5^5);
    }
}
