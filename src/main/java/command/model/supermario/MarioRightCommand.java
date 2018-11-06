package command.model.supermario;

import command.interafaces.Command;

public class MarioRightCommand implements Command {

    private SuperMarioReceiver superMarioReceiver;

    public MarioRightCommand(SuperMarioReceiver superMarioReceiver) {
        this.superMarioReceiver = superMarioReceiver;
    }

    @Override
    public void execute() {
        superMarioReceiver.moveRight();
    }
}
