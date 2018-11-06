package command.model.supermario;

import command.interafaces.Command;

public class MarioDownCommand implements Command {

    private SuperMarioReceiver superMarioReceiver;

    public MarioDownCommand(SuperMarioReceiver superMarioReceiver) {
        this.superMarioReceiver = superMarioReceiver;
    }

    @Override
    public void execute() {
        superMarioReceiver.moveDown();
    }
}
