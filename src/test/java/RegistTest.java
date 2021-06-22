import com.lxy.controller.RegistController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RegistTest {

    @Test
    public void testRegist() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        RegistController registController = (RegistController) context.getBean(RegistController.class);
        registController.register();
    }
}
