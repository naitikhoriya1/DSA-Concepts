public class main {
    
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.tip);
        BankAccount ba = new BankAccount();
        // ba.password = "ullalal";
        ba.SetPassword("illallal");
    }
}

class BankAccount{
    private String password;
    public void SetPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    String color;
    int tip;

    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int i){
        tip = i;
    }
}