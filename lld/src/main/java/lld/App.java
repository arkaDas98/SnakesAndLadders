package lld;

import java.util.Arrays;

import lld.Model.Board;
import lld.Model.BoardEntity;
import lld.Model.Dice;
import lld.Model.Ladder;
import lld.Model.Snake;
import lld.Service.GameService;
import lld.Strategy.GameWithJail;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Dice dice = new Dice(6, 1);
        Board board = new Board(20);
        BoardEntity snake1 = new Snake(4, 2);
        BoardEntity snake2 = new Snake(7, 5);
        BoardEntity snake3 = new Snake(17, 8);
        BoardEntity ladder = new Ladder(3, 6);
        board.addEntities(Arrays.asList(snake1, snake2, snake3, ladder));
        GameService service = new GameService(board, dice, new GameWithJail());
        service.addPlayer("Ankit");
        // service.addPlayer("Arka");
        service.startGame();
    }
}
