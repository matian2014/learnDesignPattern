package Decorator;

/**
 * Created by matia on 2019/02/19
 */

public class HDDisk extends Component {

    public HDDisk(Computer computer) {
        super(computer);
    }

    @Override
    public String selectComponent() {
        return super.selectComponent() + "disk = HDD";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 200;
    }
}
