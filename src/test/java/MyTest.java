import com.tao.pojo.Student;
import java.util.logging.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  private static Logger log = Logger.getLogger(String.valueOf(MyTest.class));

  @Test
  public void test() {
    // 获取Spring的上下文对象
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    // 获取 p-namespace 注入的 bean 对象
    Student student = applicationContext.getBean("student01", Student.class);
    log.info("student01 " + student.toString());
  }
}
