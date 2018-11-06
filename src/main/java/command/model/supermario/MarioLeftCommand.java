package command.model.supermario;

import command.interafaces.Command;

public class MarioLeftCommand implements Command {

    private SuperMarioReceiver superMarioReceiver;

    public MarioLeftCommand(SuperMarioReceiver superMarioReceiver) {
        this.superMarioReceiver = superMarioReceiver;
    }

    @Override
    public void execute() {
        superMarioReceiver.moveLeft();
    }
}
