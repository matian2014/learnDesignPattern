package Decorator;

/**
 * Created by matia on 2019/02/19
 */

public class BrandA extends Computer {
    @Override
    public String selectComponent() {
        return "品牌 = A;";
    }

    @Override
    public double getPrice() {
        return 1000;
    }
}
