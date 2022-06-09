package pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Doromv
 * @Description 具体聚合对象
 * @create 2022-06-09-15:44
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list=new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
