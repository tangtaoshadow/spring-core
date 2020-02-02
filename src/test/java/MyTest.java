import com.tao.config.Taoconfig;
import com.tao.pojo.Demo;
import com.tao.pojo.Student;
import java.util.logging.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
  private static Logger log = Logger.getLogger(String.valueOf(MyTest.class));

  @Test
  public void test() {
    // 获取Spring的上下文对象
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Taoconfig.class);
    Student student;
    // 获取  bean 对象
    for (int i = 0; i < 3; i++) {
      //      student = applicationContext.getBean("student", Student.class);
      student = (Student) applicationContext.getBean("student");
      log.info("student hashCode:" + student.hashCode() + "\n" + student.toString());
    }

    Demo demo;
    for (int i = 0; i < 3; i++) {
      //      demo = applicationContext.getBean("demo", Demo.class);
      demo = (Demo) applicationContext.getBean("demo");
      log.info("demo hashCode:" + demo.hashCode() + "\n" + demo.toString());
    }
  }
}
