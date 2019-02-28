package Facade;

public class MachineManagerSevice {

    public void shutdown(String innerIp) {
        System.out.println(innerIp + " shutdown.");
    }

    public void start(String innerIp) {
        System.out.println(innerIp + " start.");
    }
}
