package pattern.iterator;

/**
 * @author Doromv
 * @Description 学生类
 * @create 2022-06-09-15:35
 */
public class Student {

    private String name;

    private Integer num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Student() {
    }

    public Student(String name, Integer num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
