public class Interfaces {
    public static void main(String[] args) {
        
        Queen q = new Queen();
        q.move();

    }
}

interface ChessPlayer{
    void move();
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right,diagonal (in all 4 directions).");        
    }
}
class Hook implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right (in all 4 directions).");        
    }
}
class King implements ChessPlayer{
    public void move(){
        System.out.println("up,down,left,right,diagonal (by 1 step).");        
    }
}
