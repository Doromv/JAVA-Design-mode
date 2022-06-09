package pattern.mediator;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-09-15:00
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //和中介沟通的方法
    public void constact(String message){
        mediator.constact(message,this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("房主："+name+"获取到的信息是"+message);
    }
}
