import com.tao.pojo.Demo;
import com.tao.pojo.Person;
import java.util.logging.Logger;
import org.junit.Test;
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

    // 通过name获取bean
    demo = (Demo) applicationContext.getBean("demo2020");
    log.info("通过name获取bean " + demo.toString());
    // 通过alias获取bean
    demo = (Demo) applicationContext.getBean("aliasBeanDemo2");
    log.info("通过alias获取bean " + demo.toString());

    System.out.println();
    // 通过beans2.xml获取bean
    demo = (Demo) applicationContext.getBean("aliasBeans2Demo");
    log.info("通过beans2.xml获取bean " + demo.toString());

    System.out.println();
    // 获取 person
    Person person = (Person) applicationContext.getBean("person1");
    log.info("通过id获取 Person " + person.toString());
    /*
    Person(
      name=tangtao,
      age=22,
      strings=[string1, string2, string3],
      demo=Demo(name=beanDemo 2, status=100),
      list=[this is list 1 ., this is list 2 ., this is list 3 .],
      set=[set 1, set 2, set 3],
      map={key1=map1, key2=map2, key3=map3},
      properties={prop2=properties 2, prop1=properties 1, prop3=properties 3}
    )
     */

    System.out.println();
    // 获取 person
    demo = (Demo) applicationContext.getBean("demo2020");
    log.info("通过name获取bean " + demo.toString());
  }

  @Test
  public void test() {
    // 获取Spring的上下文对象
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    // 获取spring管理的bean 对象
    Demo demo = applicationContext.getBean("beanDemo3", Demo.class);
    log.info("获取 beanDemo3 " + demo.toString());
  }
}
