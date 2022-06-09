package pattern.iterator;

import java.util.List;

/**
 * @author Doromv
 * @Description 具体迭代器角色
 * @create 2022-06-09-15:38
 */
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> list;

    //用来记录时遍历的位置
    private Integer position=0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    //判断是否还有下一个元素
    @Override
    public Boolean hasNext() {
        return position<list.size();
    }

    //获取当前位置的元素
    @Override
    public Student next() {
        Student student = list.get(position++);
        return student;
    }
}
