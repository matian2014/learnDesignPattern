package Command;

/**
 * Created by 1309 on 2019/04/01
 */

public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();

}
