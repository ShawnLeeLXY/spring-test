import com.lxy.config.JdbcConfig;
import com.lxy.controller.RegistController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegistTest {

    // 通过xml配置文件+注解方式
    @Test
    public void testRegist() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        RegistController registController = context.getBean(RegistController.class);
        registController.register();
    }

    // 通过纯注解方式（配置类）
    @Test
    public void testRegister2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        RegistController registController = context.getBean(RegistController.class);
        registController.register();
    }

}
