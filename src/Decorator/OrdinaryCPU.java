package Decorator;

/**
 * Created by matia on 2019/02/19
 */

public class OrdinaryCPU extends Component {

    public OrdinaryCPU(Computer computer) {
        super(computer);
    }

    @Override
    public String selectComponent() {
        return super.selectComponent() + "CPU = ordinary;";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 500;
    }
}
