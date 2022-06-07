package pattern.responsibility;

/**
 * @author Doromv
 * @Description 董事长类
 * @create 2022-06-07-22:15
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNum()+"天,理由:"+leave.getContent()+"。");
        System.out.println("董事长同意");
    }
}
