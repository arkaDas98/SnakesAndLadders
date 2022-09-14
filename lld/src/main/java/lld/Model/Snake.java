package lld.Model;

public class Snake extends BoardEntity {
    int end;

    public Snake(int start, int end) {
        super(start);
        this.end = end;
    }

    public static boolean validate(int start, int end) {
        if (start < end) {
            return false;
        }
        return true;
    }

    @Override
    void actOnPlayer(Player player) {
        player.setCurrentPosition(end);
    }

}
