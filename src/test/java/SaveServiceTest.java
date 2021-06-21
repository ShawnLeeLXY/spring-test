import com.lxy.service.SaveService;
import com.lxy.service.SaveService2;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveServiceTest {

    // 测试Component注解
    @Test
    public void testSave() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        SaveService saveService = context.getBean(SaveService.class);
        saveService.save();
        System.out.println("----------");
        SaveService saveService2 = (SaveService) context.getBean("service");
        saveService2.save();
        System.out.println(saveService == saveService2);
    }

    // 测试Scope注解
    @Test
    public void testScopeSave() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

        SaveService serviceSingleton = (SaveService) context.getBean("service");
        SaveService serviceSingleton2 = (SaveService) context.getBean("service");
        System.out.println("singleton: " + (serviceSingleton == serviceSingleton2));

        SaveService2 servicePrototype = (SaveService2) context.getBean("service2");
        SaveService2 servicePrototype2 = (SaveService2) context.getBean("service2");
        System.out.println("prototype: " + (servicePrototype == servicePrototype2));
    }

    // 测试@PostConstruct和@PreDestroy注解
    @Test
    public void testInitAndDestroy() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        context.close();
    }

}
