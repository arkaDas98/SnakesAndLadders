package lld.Model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;

public class Board {
    HashMap<Integer, BoardEntity> allEntities;
    Set<Integer> cellPresent;
    @Getter
    private int totalCells;

    public Board(int totalCells) {
        this.totalCells = totalCells;
        this.allEntities = new HashMap<>();
        cellPresent = new HashSet<>();
    }

    public void addEntities(List<BoardEntity> entities) {
        entities.stream().forEach(entity -> allEntities.put(entity.position, entity));
    }

    public void actionOnMove(Player player) {
        while (allEntities.containsKey(player.currentPosition)) {
            allEntities.get(player.currentPosition).actOnPlayer(player);
        }
    }

}
