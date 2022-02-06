package edu.wctc.dice.impl;

import edu.wctc.dice.iface.DiceRoll;

import java.util.Random;

public class RollD8 implements DiceRoll {
    @Override
    public int roll() {
        Random random = new Random();
        return random.nextInt(8) + 1;
    }
}
