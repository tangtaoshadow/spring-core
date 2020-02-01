import com.tao.pojo.Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  public static void main(String[] args) {
    // 获取Spring的上下文对象
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    // 获取spring管理的bean 对象
    Demo demo = (Demo) applicationContext.getBean("beanDemo");
    System.out.println(demo.toString());
    demo = (Demo) applicationContext.getBean("beanDemo2");
    System.out.println(demo.toString());
  }
}
