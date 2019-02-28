package Facade;

public class MachineDatabaseService {

    public String queryOuterIpByInnerIp(String outerIp) {
        return "inner ip for " + outerIp;
    }
}
