package Observer.custom.MsgService;

import Observer.custom.observer.MyObserver;

/**
 * Created by matia on 2019/02/18
 */

public class MsgObserver implements MyObserver {

    private MsgSubject mSubject;

    public MsgObserver(MsgSubject subject) {
        mSubject = subject;
    }

    @Override
    public void update() {
        System.out.println(this.toString() + " " + mSubject.getMsg());
    }
}
