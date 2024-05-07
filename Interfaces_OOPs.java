public class Interfaces_OOPs {
    public static void main(String[] args) {
        Queen q = 
    }
    
}
interface ChessPlayer {
    void move();
}

class Queen implements ChessPlayer {
    public void move(){
        System.out.println("up, down, left, right,diagonal (in all 4 directions)");
    }
}
class Rook implements ChessPlayer {
    public void move(){
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer {
    public void move(){
        System.out.println("up, down, left, right,diagonal (by 1 step)");
    }
}