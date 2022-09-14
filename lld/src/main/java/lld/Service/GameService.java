package lld.Service;

import java.util.LinkedList;
import java.util.Queue;

import lld.Model.Board;
import lld.Model.Dice;
import lld.Model.Player;
import lld.Strategy.Gameplay;

public class GameService {
    Board board;
    Dice dice;
    Queue<Player> playerQueue;
    Gameplay gameplay;

    public GameService(Board board, Dice dice, Gameplay gameplay) {
        this.board = board;
        this.dice = dice;
        this.gameplay = gameplay;
        this.playerQueue = new LinkedList<>();
    }

    public void addPlayer(String name) {
        Player newPlayer = new Player(name, 0, 0);
        playerQueue.add(newPlayer);
    }

    public void startGame() throws InterruptedException {
        if (playerQueue.size() == 0) {
            throw new RuntimeException("No players");
        }
        gameplay.playGame(board, dice, playerQueue);
    }
}
