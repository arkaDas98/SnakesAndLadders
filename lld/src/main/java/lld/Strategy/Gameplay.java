package lld.Strategy;

import java.util.Queue;

import lld.Model.Board;
import lld.Model.Dice;
import lld.Model.Player;

public interface Gameplay {
    public void playGame(Board board, Dice dice, Queue<Player> queue);
}
