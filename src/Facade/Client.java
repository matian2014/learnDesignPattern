package Facade;

public class Client {

    public static void main(String[] args) {

        ManchineManagerFacade facade = new ManchineManagerFacade();
        facade.restart("outer ip");
    }
}
