package Command;

/**
 * Created by 1309 on 2019/04/01
 */

public class SiriInvoker {

    private Command cmmd;

    public void setCommand(Command cmmd) {
        this.cmmd = cmmd;
    }

    public void call() {
        cmmd.execute();
    }
}
