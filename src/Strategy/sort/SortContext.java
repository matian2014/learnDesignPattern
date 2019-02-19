package Strategy.sort;

import java.util.Comparator;
import java.util.List;

/**
 * Created by matia on 2019/02/17
 */

public class SortContext {

    private SortAlgorithm mSortAlgorithm;

    public SortContext(String algorithm) {
        switch (algorithm) {
            case "quickSort": {
                mSortAlgorithm = new QuickSort();
                break;
            }
            case "mergeSort": {
                mSortAlgorithm = new MergeSort();
                break;
            }
        }
    }

    public void sort(List<? extends Comparator> list) {
        mSortAlgorithm.sort(list);
    }
}
