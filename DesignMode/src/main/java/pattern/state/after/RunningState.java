package pattern.state.after;

/**
 * @author Doromv
 * @Description 电梯运行状态类
 * @create 2022-06-08-15:19
 */
public class RunningState extends LiftState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行");
    }

    @Override
    public void stop() {
        context.setLiftState(Context.STOPPING_STATE);
        context.stop();
    }
}
