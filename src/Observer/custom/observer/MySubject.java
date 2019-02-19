package Observer.custom.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by matia on 2019/02/18
 */

/**
 * 模式只是思想，代码可没有模板
 * 其实订阅者模式这里完全可以通过 observer.update() 函数传参，这样只需要 subject 持有 observer 的引用，observer 无需持有 subject 的引用
 * 就像 java 中实现的那样
 */
public abstract class MySubject {

    private Set<MyObserver> mObservers = new HashSet<>();

    public void attach(MyObserver observer) {
        mObservers.add(observer);
    }

    public void detach(MyObserver observer) {
        mObservers.remove(observer);
    }

    public void notifyObservers() {
        for (MyObserver observer : mObservers) {
            observer.update();
        }
    }
}
