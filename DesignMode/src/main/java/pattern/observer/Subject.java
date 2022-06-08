package pattern.observer;

/**
 * @author Doromv
 * @Description 抽象主题角色
 * @create 2022-06-08-17:08
 */
public interface Subject {

    //添加订阅者
    public void attach(Observer observer);
    //删除订阅者
    public void detach(Observer observer);
    //通知消息
    public void notify(String message);
}
