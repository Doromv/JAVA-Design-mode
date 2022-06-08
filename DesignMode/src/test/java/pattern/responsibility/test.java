package pattern.responsibility;

import org.junit.Test;
import pattern.state.after.Context;
import pattern.state.after.RunningState;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-07-22:27
 */
public class test {

    @Test
    public void Test(){
        //创建请假条对象
        LeaveRequest leaveRequest = new LeaveRequest("小明",7,"身体不适");

        //创建各级领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //设置处理链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        //提交请假条
        groupLeader.submit(leaveRequest);
    }

    @Test
    public void Test1(){

        Context context = new Context();
        context.setLiftState(new RunningState());
        context.stop();
        context.open();
        context.close();
        context.run();
    }
}
