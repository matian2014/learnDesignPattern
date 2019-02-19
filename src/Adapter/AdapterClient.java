package Adapter;

import java.util.List;

/**
 * Created by matia on 2019/02/18
 */

public class AdapterClient {

    List<Integer> mIntegers;

    public static void main(String[] args) {

        AdapterClient client = new AdapterClient();

        IntegerListManager integerListManager = new Adapter();

        client.mIntegers = integerListManager.readIntegerList();
        integerListManager.writeIntegerList(client.mIntegers);
        
    }
}
