import com.tao.pojo.Demo;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  private static Logger log = Logger.getLogger(String.valueOf(MyTest.class));

  public static void main(String[] args) {
    // 获取Spring的上下文对象
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    // 获取spring管理的bean 对象
    Demo demo = (Demo) applicationContext.getBean("beanDemo");
    log.info("获取beanDemo " + demo.toString());
    demo = (Demo) applicationContext.getBean("beanDemo2");
    log.info("获取beanDemo2 " + demo.toString());

    // 通过别名获取bean
    demo = (Demo) applicationContext.getBean("demo2020");
    log.info("通过别名获取bean " + demo.toString());
  }
}
