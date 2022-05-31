package pattern.prototype.test1;

import java.io.Serializable;

/**
 * @author Doromv
 * @Description 奖状类
 * @create 2022-05-31-11:03
 */
public class Citation implements Cloneable, Serializable {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }


    @Override
    protected Citation clone() throws CloneNotSupportedException {

        return (Citation) super.clone();
    }
}
