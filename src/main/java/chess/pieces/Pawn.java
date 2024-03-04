package chess.pieces;

public class Pawn {
    public enum Color {WHITE , BLACK}

    private final Color color;

    public Pawn(Color color) {
        this.color = color;
    }

    public Pawn(){
        this.color = Color.WHITE;
    }

    public Color getColor() {
        return color;
    }
}
