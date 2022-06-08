package pattern.state.before;

/**
 * @author Doromv
 * @Description 电梯类
 * @create 2022-06-08-14:35
 */
public class Lift implements Ilift{

    //记录当前电梯状态的变量
    private int state;

    @Override
    public void setState(int state) {
        this.state=state;
    }

    @Override
    public void open() {
        switch (state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了");
                //设置当前电梯状
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了");
                //设置当前电梯状
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void close() {
        switch (state){
            case OPENING_STATE:
                System.out.println("电梯关门了");
                //设置当前电梯状
                setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case STOPPING_STATE:
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch (state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯开始运行了");
                //设置当前电梯状
                setState(RUNNING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯开始运行了");
                //设置当前电梯状
                setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void stop() {
        switch (state){
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯停止了");
                //设置当前电梯状
                setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止了");
                //设置当前电梯状
                setState(STOPPING_STATE);
                break;
        }
    }
}
