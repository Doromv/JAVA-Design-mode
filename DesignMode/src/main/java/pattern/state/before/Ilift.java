package pattern.state.before;

/**
 * @author Doromv
 * @Description 电梯接口
 * @create 2022-06-08-14:27
 */
public interface Ilift {

    //定义四个电梯状态的常量
    int OPENING_STATE=1;
    int CLOSING_STATE=2;
    int RUNNING_STATE=3;
    int STOPPING_STATE=4;

    //设置电梯状态的功能
    void setState(int state);

    //电梯操作的功能
    void open();

    void close();

    void run();

    void stop();
}
