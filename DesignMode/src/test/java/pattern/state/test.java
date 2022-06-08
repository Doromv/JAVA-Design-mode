package pattern.state;

import org.junit.Test;
import pattern.state.before.Ilift;
import pattern.state.before.Lift;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-08-14:47
 */
public class test {
    @Test
    public void Test(){

        //创建电梯对象
        Lift lift = new Lift();

        //设置当前电梯的状态
        lift.setState(Ilift.RUNNING_STATE);

        lift.open();
        lift.close();
        lift.run();
        lift.stop();

    }
}
