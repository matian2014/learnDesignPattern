package Decorator;

/**
 * Created by matia on 2019/02/19
 */

public abstract class Component extends Computer {
    private Computer mComputer;

    public Component(Computer computer) {
        mComputer = computer;
    }

    @Override
    public String selectComponent() {
        return mComputer.selectComponent();
    }

    @Override
    public double getPrice() {
        return mComputer.getPrice();
    }
}
