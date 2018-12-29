package template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Game {

    protected abstract void initialize();

    protected abstract void start();

    protected abstract void end();

    protected void loadAssets() {
    }

    public final void play() {
        loadAssets();
        initialize();
        start();
        if (addNewCharacter()) {
            addNewCharacterToTheGame();
        }
        end();
    }

    protected abstract void addNewCharacterToTheGame();

    boolean addNewCharacter() {
        final String answer = getAnswer();
        if (answer.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }

    private String getAnswer() {
        String answer = null;

        System.out.println("New character? y/n");

        BufferedReader in = new BufferedReader(new BufferedReader(new InputStreamReader((System.in))));

        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            answer = "no";
        }
        return answer;
    }
}
