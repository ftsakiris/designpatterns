package command.model.batman;

import command.interafaces.Command;

public class BatmanLeftCommand implements Command {

    private BatmanReceiver batmanReceiver;

    public BatmanLeftCommand(BatmanReceiver batmanReceiver) {
        this.batmanReceiver = batmanReceiver;
    }

    @Override
    public void execute() {
        batmanReceiver.moveLeft();
    }
}
