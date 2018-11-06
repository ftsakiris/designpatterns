package command.model.batman;

import command.interafaces.Command;

public class BatmanUpCommand implements Command {

    private BatmanReceiver batmanReceiver;

    public BatmanUpCommand(BatmanReceiver batmanReceiver) {
        this.batmanReceiver = batmanReceiver;
    }

    @Override
    public void execute() {
        batmanReceiver.moveUp();
    }
}
