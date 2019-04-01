package Command;

/**
 * Created by 1309 on 2019/04/01
 */

public class CommandClient {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        SiriInvoker invoker = new SiriInvoker();

        Command command = new LightScreenCmmd(receiver);
        invoker.setCommand(command);
        invoker.call();

        Command command2 = new ShutdownCmmd(receiver);
        invoker.setCommand(command2);
        invoker.call();


    }

}
