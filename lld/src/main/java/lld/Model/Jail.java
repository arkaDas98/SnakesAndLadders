package lld.Model;

public class Jail extends BoardEntity {

    int jailValue;

    public Jail(int position, int jailVal) {
        super(position);
        this.jailValue = jailVal;
    }

    @Override
    void actOnPlayer(Player player) {
        player.setJailVal(jailValue);
    }

}
