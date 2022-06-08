package pattern.state.after;

/**
 * @author Doromv
 * @Description 电梯停止状态类
 * @create 2022-06-08-15:19
 */
public class StoppingState extends LiftState{
    @Override
    public void open() {
        context.setLiftState(Context.OPENING_STATE);
        context.getLiftState().open();
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.open();
    }

    @Override
    public void run() {
        context.setLiftState(Context.RUNNING_STATE);
        context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
