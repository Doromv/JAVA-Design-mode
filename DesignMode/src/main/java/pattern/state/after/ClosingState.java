package pattern.state.after;

/**
 * @author Doromv
 * @Description 电梯关闭状态类
 * @create 2022-06-08-15:19
 */
public class ClosingState extends LiftState{
    @Override
    public void open() {
        context.setLiftState(Context.OPENING_STATE);
        context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void run() {
        context.setLiftState(Context.RUNNING_STATE);
        context.open();
    }

    @Override
    public void stop() {
        context.setLiftState(Context.STOPPING_STATE);
        context.open();
    }
}
