package command.model.batman;

import command.interafaces.Command;

public class BatmanRightCommand implements Command {

    private BatmanReceiver batmanReceiver;

    public BatmanRightCommand(BatmanReceiver batmanReceiver) {
        this.batmanReceiver = batmanReceiver;
    }

    @Override
    public void execute() {
        batmanReceiver.moveRight();
    }
}
