package pattern.iterator;
/**
 * @author Doromv
 * @Description 抽象聚合对象
 * @create 2022-06-09-15:38
 */
public interface StudentAggregate {

    //添加学生功能
    void addStudent(Student student);

    //删除学生功能
    void removeStudent(Student student);

    //获取迭代器对象功能
    StudentIterator getStudentIterator();
}