package Facade;

public class ManchineManagerFacade {

    private MachineDatabaseService machineDatabaseService;
    private MachineManagerSevice machineManagerSevice;

    public ManchineManagerFacade() {
        this.machineDatabaseService = new MachineDatabaseService();
        this.machineManagerSevice = new MachineManagerSevice();
    }

    public void restart(String ip) {
        String innerIp = machineDatabaseService.queryOuterIpByInnerIp(ip);
        machineManagerSevice.shutdown(innerIp);
        machineManagerSevice.start(innerIp);
    }

}
