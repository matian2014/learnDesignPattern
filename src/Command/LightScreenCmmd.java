package Command;

/**
 * Created by 1309 on 2019/04/01
 */

public class LightScreenCmmd extends Command {

    public LightScreenCmmd(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("亮屏");
        receiver.action();
    }
}
