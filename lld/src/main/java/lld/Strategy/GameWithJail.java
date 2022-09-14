package lld.Strategy;

import java.util.Queue;

import lld.Model.Board;
import lld.Model.Dice;
import lld.Model.Player;

public class GameWithJail implements Gameplay {

    @Override
    public void playGame(Board board, Dice dice, Queue<Player> queue) {
        while (true) {
            Player currentPlayer = queue.poll();
            if (currentPlayer.getJailVal() > 0) {
                currentPlayer.setJailVal(currentPlayer.getJailVal() - 1);
                continue;
            }
            int positionBeforeThrow = currentPlayer.getCurrentPosition();
            int throwVal = dice.getRandom();
            setNextPositionForPlayer(currentPlayer, throwVal, board);

            if (currentPlayer.getCurrentPosition() == board.getTotalCells()) {
                System.out.println(currentPlayer.getName() + " wins the game, by throwing:: " + throwVal);
                return;
            }
            if (currentPlayer.getCurrentPosition() > board.getTotalCells()) {
                currentPlayer.setCurrentPosition(positionBeforeThrow);
            }
            System.out.println(currentPlayer.getName() + " rolled a " +
                    throwVal + " and moved from " + positionBeforeThrow + " to " + currentPlayer.getCurrentPosition());
            queue.add(currentPlayer);
        }
    }

    private void setNextPositionForPlayer(Player player, int throwVal, Board board) {
        int nextTempPosition = player.getCurrentPosition() + throwVal;
        player.setCurrentPosition(nextTempPosition);
        board.actionOnMove(player);
    }

}
