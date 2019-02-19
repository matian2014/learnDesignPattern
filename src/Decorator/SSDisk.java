package Decorator;

/**
 * Created by matia on 2019/02/19
 */

public class SSDisk extends Component {

    public SSDisk(Computer computer) {
        super(computer);
    }

    @Override
    public String selectComponent() {
        return super.selectComponent() + "disk = SSD;";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 600;
    }
}
