package strategy1.model;

import strategy1.controller.ScoreBoardBase;

public class SquareBalloon extends ScoreBoardBase {
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
