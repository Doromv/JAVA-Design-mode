package pattern.command;

/**
 * @author Doromv
 * @Description 接收者角色
 * @create 2022-06-07-20:37
 */
public class SeniorChef {

    //厨师的姓名
    private String name;

    public String getName() {
        return name;
    }

    public SeniorChef(String name) {
        this.name = name;
    }

    public void makeFood(String name, Integer num){
        System.out.println(num+"份"+name);
    }
}
