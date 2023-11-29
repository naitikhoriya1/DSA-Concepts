public class interfaces {

    public static void main(String[] args) {
        Queen rani = new Queen();
        rani.moves();

        yellow yl = new yellow();
        yl.luck();
        yl.moves();
    }
}

interface ChessPlayer {
    void moves();
}
interface ludo {
    void luck();
}

class yellow implements ChessPlayer , ludo{
    public void luck(){
        System.out.println("luck is with you");
    }
    public void moves(){
        System.out.println("i can move in chess and ludo");
    }
}
class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up , down , left , right, diagonal (in all direction )");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up , down , left , right ");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up , down , left , right, diagonal (by i step )");
    }
}
