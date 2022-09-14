package lld.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Player {
    String name;
    @Setter
    int currentPosition;
    @Setter
    int jailVal;
}
