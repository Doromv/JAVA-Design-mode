package pattern.state.after;

/**
 * @author Doromv
 * @Description 电梯启动状态类
 * @create 2022-06-08-15:19
 */
public class OpeningState extends LiftState{

    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        context.setLiftState(Context.CLOSING_STATE);
        context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
