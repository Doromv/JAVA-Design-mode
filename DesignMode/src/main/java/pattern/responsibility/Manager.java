package pattern.responsibility;

/**
 * @author Doromv
 * @Description 经理类
 * @create 2022-06-07-22:15
 */
public class Manager extends Handler{

    public Manager() {
        super( Handler.NUM_ONE,Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNum()+"天,理由:"+leave.getContent()+"。");
        System.out.println("经理同意");
    }
}
