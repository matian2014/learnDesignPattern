package Strategy.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by matia on 2019/02/17
 */

public abstract class SortAlgorithm {

    public abstract void sort(List<? extends Comparator> list);
}
