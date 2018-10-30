package strategy1;

import strategy1.controller.ScoreBoard;
import strategy1.model.Balloon;
import strategy1.model.Clown;
import strategy1.model.SquareBalloon;

public class Main {

    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard(new Balloon());

        System.out.println(scoreBoard.showScore(10, 5));

        scoreBoard = new ScoreBoard(new Clown());
        System.out.println(scoreBoard.showScore(10, 5));

        scoreBoard = new ScoreBoard(new SquareBalloon());
        System.out.println(scoreBoard.showScore(10, 5));
    }
}
