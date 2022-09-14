package lld.Model;

import java.util.Random;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dice {

    int faces;
    int numberOfDice;

    public int getRandom() {
        Random rng = new Random();
        int val = rng.nextInt(faces * numberOfDice) + 1;
        return val;
    }
}
