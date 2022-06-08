package pattern.observer;

/**
 * @author Doromv
 * @Description 具体的观察者类
 * @create 2022-06-08-17:15
 */
public class VxUser implements Observer{

    private String name;

    public VxUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"-"+message);
    }
}
