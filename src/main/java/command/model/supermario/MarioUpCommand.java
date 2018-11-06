package command.model.supermario;

import command.interafaces.Command;

public class MarioUpCommand implements Command {

    private SuperMarioReceiver superMarioReceiver;

    public MarioUpCommand(SuperMarioReceiver superMarioReceiver) {
        this.superMarioReceiver = superMarioReceiver;
    }

    @Override
    public void execute() {
        superMarioReceiver.moveUp();
    }
}
