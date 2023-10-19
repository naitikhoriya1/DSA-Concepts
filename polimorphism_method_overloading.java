public class polimorphism_method_overloading {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.sum(10,20));
        System.out.println(calc.sum(10,20, 30));
        System.out.println(calc.sum((float)9.44,(float)19.66));
    }
}
class calculator{
    int sum(int a ,  int b){
        return a+b;
    }
    float sum (float a, float b){
        return  a+b;
    }
    int sum(int a, int b, int c){
        return a + b +c ;
    }
}
