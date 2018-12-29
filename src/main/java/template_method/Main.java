package template_method;

public class Main {

    public static void main(String[] args) {
        FootbalGame footbalGame = new FootbalGame();
        BasketGame basketGame = new BasketGame();

        footbalGame.play();
        basketGame.play();
    }
}