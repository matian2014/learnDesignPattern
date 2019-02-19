package Decorator;

/**
 * Created by matia on 2019/02/19
 */

public class HighPerformanceCPU extends Component {

    public HighPerformanceCPU(Computer computer) {
        super(computer);
    }

    @Override
    public String selectComponent() {
        return super.selectComponent() + "CPU = high;";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1000;
    }
}
