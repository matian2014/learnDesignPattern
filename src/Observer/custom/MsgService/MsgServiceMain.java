package Observer.custom.MsgService;

/**
 * Created by matia on 2019/02/18
 */

public class MsgServiceMain {

    public static void main(String[] args) {

        MsgSubject msgSubject = new MsgSubject();

        MsgObserver observer1 = new MsgObserver(msgSubject);
        msgSubject.attach(observer1);

        msgSubject.setMsg("1");
        msgSubject.notifyObservers();

        System.out.println("--------");

        MsgObserver observer2 = new MsgObserver(msgSubject);
        msgSubject.attach(observer2);

        msgSubject.setMsg("2");
        msgSubject.notifyObservers();
    }
}
