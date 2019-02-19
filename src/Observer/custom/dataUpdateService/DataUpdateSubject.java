package Observer.custom.dataUpdateService;

import Observer.custom.observer.MySubject;

/**
 * Created by matia on 2019/02/18
 */

public class DataUpdateSubject extends MySubject {

    private String subjectData;

    public String getSubjectData() {
        return subjectData;
    }

    public void setSubjectData(String subjectData) {
        this.subjectData = subjectData;
        System.out.println(this.getClass().getSimpleName() + " " + subjectData);
    }
}
