public class Move {

    // Parsing a list of moves
    public void move(List moveList){
        for(String move : moveList){
            switch (move) {
            case u: Controls.up(); break;
            case d: Controls.down(); break;
            case l: Controls.left(); break;
            case r: Controls.right(); break;
            case a: Controls.a(); break;
            case b: Controls.b(); break;
            default: System.out.println("Illegal Move!"); break;
            }
        }
    }

}
