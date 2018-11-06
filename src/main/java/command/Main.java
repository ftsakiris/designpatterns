package command;

import command.model.GameBoy;
import command.model.batman.*;
import command.model.supermario.*;

public class Main {

    public static void main(String[] args) {

        SuperMarioReceiver mario = new SuperMarioReceiver("Mario");

        BatmanReceiver batman = new BatmanReceiver("Batman");

        GameBoy gameBoy = new GameBoy(
                new MarioUpCommand(mario)
                , new MarioDownCommand(mario)
                , new MarioLeftCommand(mario)
                , new MarioRightCommand(mario)
        );

        gameBoy.arrowDown();
        gameBoy.arrowDown();

        GameBoy gameBoy2 = new GameBoy(
                new BatmanUpCommand(batman)
                , new BatmanDownCommand(batman)
                , new BatmanLeftCommand(batman)
                , new BatmanRightCommand(batman)
        );

        gameBoy2.arrowDown();
        gameBoy2.arrowRight();
    }
}
