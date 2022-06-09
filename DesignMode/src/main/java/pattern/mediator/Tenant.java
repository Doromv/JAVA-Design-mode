package pattern.mediator;

/**
 * @author Doromv
 * @Description 具体的同事类
 * @create 2022-06-09-14:48
 */
public class Tenant extends Person {

    public Tenant(String name,Mediator mediator) {
        super(name, mediator);
    }

    //和中介沟通的方法
    public void constact(String message){
        mediator.constact(message,this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("租房者："+name+"获取到的信息是"+message);
    }
}
