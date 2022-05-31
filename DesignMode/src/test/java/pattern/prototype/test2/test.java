package pattern.prototype.test2;

import org.junit.Test;
import pattern.prototype.test1.Citation;
import pattern.prototype.test1.Student;

import java.io.*;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-31-11:36
 */
public class test {
    @Test
    public void Test() throws Exception {
        //创建原型对象
        Citation citation = new Citation();
        //创建学生对象
        Student student = new Student();
        student.setName("Doromv");
        citation.setStudent(student);
        //创建对象输出流对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("e:/a.txt"));
        //将citation对象写出到文件中
        objectOutputStream.writeObject(citation);
        //释放资源
        objectOutputStream.close();
        //读取对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("e:/a.txt"));
        //获取c2奖状所属学生对象
        Citation citation1 = (Citation) objectInputStream.readObject();
        //释放资源
        objectInputStream.close();
        //修改学生名称
        citation1.getStudent().setName("zr");
        citation.show();
        citation1.show();
    }
}
