package pattern.responsibility;

/**
 * @author Doromv
 * @Description 小组长类
 * @create 2022-06-07-22:15
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNum()+"天,理由:"+leave.getContent()+"。");
        System.out.println("小组长同意");
    }
}
