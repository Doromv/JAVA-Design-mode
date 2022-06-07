package pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Doromv
 * @Description 请求者角色
 * @create 2022-06-07-20:48
 */
public class Waitor {

    //持有多个命令对象
    private List<Command> commands=new ArrayList<>();

    public void setCommands(Command command) {
        this.commands.add(command);
    }

    //发起命令的方法
    public void orderUp(){
        System.out.println("大厨新订单来了：");
        List<Command> commands = this.commands;
        for (Command command : commands) {
            if(command!=null){
                command.execute();
            }
        }
    }
}
