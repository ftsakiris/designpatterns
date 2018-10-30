package strategy1.controller;

public class ScoreBoard {

    private ScoreBoardBase algorithm;

    public ScoreBoard(ScoreBoardBase algorithm) {
        this.algorithm = algorithm;
    }

    public int showScore(int taps, int multiplier) {
        return algorithm.calculateScore(taps, multiplier);
    }
}
