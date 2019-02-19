package Observer.custom.dataUpdateService;

/**
 * Created by matia on 2019/02/18
 */

public class DataUpdateServiceMain {

    public static void main(String[] args) {

        DataUpdateSubject mySubject = new DataUpdateSubject();

        DataUpdateInPCObserver pcObserver = new DataUpdateInPCObserver(mySubject);
        mySubject.attach(pcObserver);

        DataUpdateInPhoneObserver phoneObserver = new DataUpdateInPhoneObserver(mySubject);
        mySubject.attach(phoneObserver);

        mySubject.setSubjectData("1");
        mySubject.notifyObservers();

        System.out.println("--------");

        mySubject.detach(pcObserver);
        mySubject.setSubjectData("2");
        mySubject.notifyObservers();


    }
}
