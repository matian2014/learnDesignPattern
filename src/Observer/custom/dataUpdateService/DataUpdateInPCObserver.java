package Observer.custom.dataUpdateService;

import Observer.custom.observer.MyObserver;

/**
 * Created by matia on 2019/02/18
 */

public class DataUpdateInPCObserver implements MyObserver {

    private String observerData;
    private DataUpdateSubject mSubject;

    public DataUpdateInPCObserver(DataUpdateSubject subject) {
        this.mSubject = subject;
    }

    @Override
    public void update() {
        this.observerData = mSubject.getSubjectData();
        System.out.println(this.getClass().getSimpleName() + " " + observerData);
    }
}
