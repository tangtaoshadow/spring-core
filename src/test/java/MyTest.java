import com.tao.config.Taoconfig;
import com.tao.config.Taoconfig3;
import com.tao.pojo.Demo;
import com.tao.pojo.Student;
import com.tao.service.AppleService;
import java.util.logging.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

  @Test
  public void testAop01() {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    AppleService appleService = applicationContext.getBean("appleService01", AppleService.class);
    System.out.println("***********  testAop01  **********\n\n");

    appleService.query();
    System.out.println();

    appleService.delete();
    System.out.println();

    appleService.update();
  }

  @Test
  public void testAop02() {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
    AppleService appleService = applicationContext.getBean("appleService02", AppleService.class);
    System.out.println("***********  testAop02  **********\n\n");

    appleService.query();
    System.out.println();

    appleService.delete();
    System.out.println();

    appleService.update();
  }

  @Test
  public void testAop03() {
    //  纯注解实现 aop
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(Taoconfig3.class);
    AppleService appleService = applicationContext.getBean("appleServiceImpl", AppleService.class);
    System.out.println("***********  testAop03  **********\n\n");

    appleService.query();
    System.out.println();

    appleService.delete();
    System.out.println();

    appleService.update();
  }

  @Test
  public void testAop04() {
    //  注解+xml实现 aop
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    AppleService appleService = applicationContext.getBean("appleService04", AppleService.class);
    System.out.println("***********  testAop04  **********\n\n");
    appleService.query();
    System.out.println();

    appleService.delete();
    System.out.println();

    appleService.update();
  }
}
