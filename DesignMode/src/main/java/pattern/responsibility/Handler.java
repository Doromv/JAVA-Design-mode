package pattern.responsibility;

/**
 * @author Doromv
 * @Description 抽象处理者类
 * @create 2022-06-07-22:00
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //该领导处理的请假天数区间
    private int numStart;
    private int numEnd;

    //声明后继者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置后继者对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请教条的方法
    protected abstract void handleLeave(LeaveRequest leave);

    //提交请假条
    public final void submit(LeaveRequest leave){
        //该领导进行审批
        if(leave.getNum()>this.numEnd){
            if(this.nextHandler==null){
                throw new RuntimeException("超出最大请假天数，不予通过！");
            }
            this.nextHandler.submit(leave);
        }else {
            this.handleLeave(leave);
            System.out.println("流程结束！");
        }
    }
}
