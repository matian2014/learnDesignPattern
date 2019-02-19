package Adapter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by matia on 2019/02/18
 */

public class Adapter extends IntegerListManager {

    private IntegerArrayManagerAdaptee mAdaptee = new IntegerArrayManagerAdaptee();

    @Override
    public List<Integer> readIntegerList() {
        return Arrays.asList(mAdaptee.readIntegerArray());
    }

    @Override
    public void writeIntegerList(List<Integer> integers) {
        Integer[] integers1 = new Integer[integers.size()];
        mAdaptee.writeIntegerArray(integers.toArray(integers1));
        return;
    }
}
