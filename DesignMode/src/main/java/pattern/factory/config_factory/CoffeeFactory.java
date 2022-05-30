package pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-30-11:01
 */
public class CoffeeFactory {

    //加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储
    //1.定义容器对象用来存储Coffee对象
    private static HashMap<String,Coffee> map=new HashMap<>();
    //2.加载配置文件，只需要加载一次
    static {
        //2.1创建properties对象
        Properties properties = new Properties();
        //2.2调用properties对象中的load方法进行配置文件的加载
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            //从properties中获取全类名并创建对象
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                //将对象存储到容器中
                map.put((String) key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //根据名称获取对象
    public static Coffee createCoffee(String name){

        return map.get(name);
    }
}
