package Decorator;

/**
 * Created by matia on 2019/02/19
 */

public class DecoratorClient {

    public static void main(String[] args) {

        Computer computer = new BrandA();
        computer = new HighPerformanceCPU(computer);
        computer = new HDDisk(computer);

        System.out.println(computer.selectComponent());
        System.out.println(computer.getPrice());

        Computer computer1 = new BrandB();
        computer1 = new OrdinaryCPU(computer1);
        computer1 = new SSDisk(computer1);

        System.out.println(computer1.selectComponent());
        System.out.println(computer1.getPrice());

    }
}
