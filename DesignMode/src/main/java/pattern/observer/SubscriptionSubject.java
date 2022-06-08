package pattern.observer;

import pattern.state.after.LiftState;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Doromv
 * @Description 具体的主题类
 * @create 2022-06-08-17:12
 */
public class SubscriptionSubject implements Subject{

    //存储观察者对象的集合
    private List<Observer> vxUserList=new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        vxUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        vxUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        //遍历集合
        for (Observer observer : vxUserList) {
            observer.update(message);
        }
    }
}
