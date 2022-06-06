package pattern.flyweight;

import java.util.HashMap;

/**
 * @author Doromv
 * @Description 工厂类，将该类设计为单例
 * @create 2022-06-06-16:26
 */
public class BoxFactory {

    private HashMap<String,AbstractBox> map;

    //在构造方法中初始化map
    private BoxFactory() {
        this.map = new HashMap<>();
        map.put("I",new IBox());
        map.put("O",new OBox());
        map.put("L",new LBox());
    }
    //提供一个方法获取该工厂对象
    private static BoxFactory factory=new BoxFactory();
    public static BoxFactory getInstance(){
        return factory;
    }
    //根据名称获取图形对象
    public AbstractBox getShape(String name){
        return map.get(name);
    }
}
