package strategy1.model;

import strategy1.controller.ScoreBoardBase;

public class Balloon extends ScoreBoardBase {
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
