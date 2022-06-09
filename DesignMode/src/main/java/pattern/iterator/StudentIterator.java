package pattern.iterator;

/**
 * @author Doromv
 * @Description 抽象迭代器接口
 * @create 2022-06-09-15:36
 */
public interface StudentIterator {

    //判断是否还有元素
    Boolean hasNext();
    //获取下一个元素
    Student next();
}
