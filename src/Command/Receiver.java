package Command;

/**
 * Created by 1309 on 2019/04/01
 */

public class Receiver {

    public void action() {
        System.out.println(this.getClass().getSimpleName() + " -> " + "action();");
    }

}
