package Decorator;

/**
 * Created by matia on 2019/02/19
 */

public class BrandB extends Computer {
    @Override
    public String selectComponent() {
        return "品牌 = B;";
    }

    @Override
    public double getPrice() {
        return 1500;
    }
}
