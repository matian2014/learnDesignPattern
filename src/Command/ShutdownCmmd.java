package Command;

/**
 * Created by 1309 on 2019/04/01
 */

public class ShutdownCmmd extends Command {

    public ShutdownCmmd(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("关机");
        receiver.action();
    }
}
