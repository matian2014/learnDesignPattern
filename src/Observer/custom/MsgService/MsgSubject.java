package Observer.custom.MsgService;

import Observer.custom.observer.MySubject;

/**
 * Created by matia on 2019/02/18
 */

public class MsgSubject extends MySubject {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
