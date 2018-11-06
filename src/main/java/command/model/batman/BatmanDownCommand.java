package command.model.batman;

import command.interafaces.Command;

public class BatmanDownCommand implements Command {

    private BatmanReceiver batmanReceiver;

    public BatmanDownCommand(BatmanReceiver batmanReceiver) {
        this.batmanReceiver = batmanReceiver;
    }

    @Override
    public void execute() {
        batmanReceiver.moveDown();
    }
}
