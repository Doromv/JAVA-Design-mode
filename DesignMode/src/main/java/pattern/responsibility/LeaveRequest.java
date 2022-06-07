package pattern.responsibility;

/**
 * @author Doromv
 * @Description 请假条类
 * @create 2022-06-07-21:59
 */
public class LeaveRequest {

    //请假姓名
    private String name;
    //请假天数
    private int num;
    //请假内容
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
