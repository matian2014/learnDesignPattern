package Adapter;

import java.util.List;

/**
 * Created by matia on 2019/02/18
 */

public abstract class IntegerListManager {

    public abstract List<Integer> readIntegerList();

    public abstract void writeIntegerList(List<Integer> integers);
}
