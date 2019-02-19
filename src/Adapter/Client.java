package Adapter;

import java.util.List;

/**
 * Created by matia on 2019/02/18
 */

public class Client {

    List<Integer> mIntegers;

    public static void main(String[] args) {

        Client client = new Client();

        IntegerListManager integerListManager = new Adapter();

        client.mIntegers = integerListManager.readIntegerList();
        integerListManager.writeIntegerList(client.mIntegers);
        
    }
}
