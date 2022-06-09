package pattern.iterator;

import org.junit.Test;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-09-15:49
 */
public class test {

    @Test
    public void Test(){
        Student student1 = new Student("xm",1);
        Student student2 = new Student("xh",2);
        Student student3 = new Student("xl",3);

        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(student1);
        studentAggregate.addStudent(student2);
        studentAggregate.addStudent(student3);

        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }
    }
}
