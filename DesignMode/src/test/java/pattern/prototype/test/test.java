package pattern.prototype.test;

import org.junit.Test;

import javax.crypto.CipherSpi;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Doromv
 * @Description
 * @create 2022-05-31-11:05
 */
public class test {

    @Test
    public void Test() throws Exception{
        //创建原型对象
        Citation citation = new Citation();
        //创建学生对象
        Student student = new Student();
        student.setName("Doromv");
        citation.setStudent(student);
        //对原型对象进行克隆
        Citation citation1 = citation.clone();
        citation1.getStudent().setName("doromv");
        //调用show方法
        citation.show();
        citation1.show();
        System.out.println(citation==citation1);

    }
}
