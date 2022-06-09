package pattern.mediator;

/**
 * @author Doromv
 * @Description 抽象同事类
 * @create 2022-06-09-14:45
 */
public abstract class Person {

    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
