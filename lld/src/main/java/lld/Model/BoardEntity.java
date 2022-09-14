package lld.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class BoardEntity {
    int position;

    abstract void actOnPlayer(Player player);
}
